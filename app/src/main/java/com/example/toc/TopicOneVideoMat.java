package com.example.toc;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.SimpleExoPlayerView;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;


public class TopicOneVideoMat extends AppCompatActivity {
    private Uri videoUri;
    private SimpleExoPlayerView exoPlayerView;
    private SimpleExoPlayer exoPlayer;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_one_video_mat);

        videoUri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/t-o-c-e25af.appspot.com/o/lecture%20videos%20%2FAPP-Introduction1.mp4?alt=media&token=6b8bc02a-b984-46ec-bcf4-34dddd9861f0");

        exoPlayerView = (SimpleExoPlayerView) findViewById(R.id.ExoplayerView);

        try {
            BandwidthMeter bandwidthMeter = new DefaultBandwidthMeter();
            TrackSelector trackSelector = new DefaultTrackSelector(new AdaptiveTrackSelection.Factory(bandwidthMeter));
            exoPlayer = ExoPlayerFactory.newSimpleInstance(this, trackSelector);
            DefaultHttpDataSourceFactory dataSourceFactory = new DefaultHttpDataSourceFactory("exoPlayer_video");
            ExtractorsFactory extractorsFactory = new DefaultExtractorsFactory();
            MediaSource mediaSource = new ExtractorMediaSource(videoUri, dataSourceFactory, extractorsFactory, null,null);
            exoPlayerView.setPlayer(exoPlayer);
            exoPlayer.prepare(mediaSource);
            exoPlayer.setPlayWhenReady(true);
        }catch (Exception e){
            Log.e("Exoplayer","Exoplayer error"+e.toString());
        }


    }

    @Override
    protected void onStop() {
        super.onStop();
        if (exoPlayerView != null) {
            exoPlayer.setPlayWhenReady(false);
        }
    }

    @Override public void onPause() {
        super.onPause();
        if (exoPlayerView != null) {
            exoPlayer.setPlayWhenReady(false);
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (exoPlayerView != null) {
            exoPlayer.release();

        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (exoPlayerView != null) {
            exoPlayer.setPlayWhenReady(true);

        }
    }
}