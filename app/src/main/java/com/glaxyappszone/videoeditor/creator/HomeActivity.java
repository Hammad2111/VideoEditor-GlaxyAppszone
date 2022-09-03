package com.glaxyappszone.videoeditor.creator;


import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.glaxyappszone.videoeditor.creator.listmusicandmymusic.ListMusicAndMyMusicActivity;
import com.glaxyappszone.videoeditor.creator.listvideoandmyvideo.ListVideoAndMyAlbumActivity;
import com.glaxyappszone.videoeditor.creator.listvideowithmymusic.ListVideoAndMyMusicActivity;
import com.glaxyappszone.videoeditor.creator.phototovideo.SelectImageAndMyVideoActivity;
import com.glaxyappszone.videoeditor.creator.videocollage.ListCollageAndMyAlbumActivity;
import com.glaxyappszone.videoeditor.creator.videotogif.GifListVideoAndMyAlbumActivity;


public class HomeActivity extends AppCompatActivity {







    LinearLayout
            fastmotion,videomerger,videomirror,videosplit,videotogif,phototovideo,videocollage,
            slowmotion, vidmute, vidreverse,videorotate,videotoimage,audiovideomixer,videowatermark,
            videojoiner, videocutter,videocrop,videocompress,videoconvertor,videotomp3,audiocutter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        if (Build.VERSION.SDK_INT >= 23) {
            requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 101);
        }

      /*  FrameLayout nativeFrame = findViewById(R.id.nativeAdPlaceHolder);
        AdsUtility.loadNativeAd(this, nativeFrame, R.layout.ad_unified_med);
*/





        videocutter=findViewById(R.id.video_cutter);
        fastmotion=findViewById(R.id.fast_motion);
        slowmotion=findViewById(R.id.slowmotion);
        vidmute=findViewById(R.id.video_mute);
        videojoiner=findViewById(R.id.video_joiner);
        videocrop=findViewById(R.id.video_crop);
        vidreverse=findViewById(R.id.video_reverse);
        videomerger=findViewById(R.id.video_merger);
        videomirror=findViewById(R.id.video_mirror);
        videorotate=findViewById(R.id.videorotate);
        videosplit=findViewById(R.id.videospilit);
        videoconvertor=findViewById(R.id.videoconvertor);
        videocompress=findViewById(R.id.videocompress);
        videotogif=findViewById(R.id.videotogif);
        videotoimage=findViewById(R.id.videotoimage);
        phototovideo=findViewById(R.id.phototoimage);
        audiovideomixer=findViewById(R.id.audiovideomixer);
        videotomp3=findViewById(R.id.videotomp3);
        videowatermark=findViewById(R.id.videowatermark);
        audiocutter=findViewById(R.id.audiocutter);


        videocollage=findViewById(R.id.videocollage);

        videocutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                videocutter();

            }
        });
        audiocutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               audiocutter();

            }
        });
        videocollage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              videocollage();

            }
        });

        fastmotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fastmotion();


            }
        });
        slowmotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                slowmotion();


            }
        });
        vidmute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                videomute();


            }
        });
        videojoiner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videojoin();


            }
        });

        videocrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               videocrop();

            }
        });

        vidreverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                videoreverse();

            }
        });

        videomerger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               videojoin();

            }
        });
        videomirror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               videomirror();

            }
        });

        videorotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               videorotate();

            }
        });

        videosplit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              videosplit();

            }
        });

        videocompress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               videocompress();

            }
        });

        videoconvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                videoformatchange();

            }
        });

        videotogif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               videotogif();

            }
        });

        videotoimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               videotoimg();

            }
        });
        videotomp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videotomp3();

            }
        });


        phototovideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 phototovideo();
            }
        });

        audiovideomixer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               audiovideomixer();
            }
        });

        videowatermark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videowatermark();

            }
        });





    }

    public void audiocutter() {
        Helper.ModuleId = 20;
        Intent intent = new Intent(HomeActivity.this, ListMusicAndMyMusicActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
    public void videowatermark() {
        Helper.ModuleId = 22;
        Intent intent = new Intent(HomeActivity.this, ListVideoAndMyAlbumActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    public void videocollage() {
        Helper.ModuleId = 17;
        Intent intent = new Intent(HomeActivity.this, ListCollageAndMyAlbumActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    public void videotomp3() {
        Helper.ModuleId = 3;
        Intent intent = new Intent(HomeActivity.this, ListVideoAndMyMusicActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }


    public void audiovideomixer() {
        Helper.ModuleId = 4;
        Intent intent = new Intent(HomeActivity.this, ListVideoAndMyAlbumActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    public void phototovideo() {
        Helper.ModuleId = 21;
        Intent intent = new Intent(HomeActivity.this, SelectImageAndMyVideoActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
    public void videotoimg() {
        Helper.ModuleId = 7;
        Intent intent = new Intent(HomeActivity.this, GifListVideoAndMyAlbumActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    public void videotogif() {
        Helper.ModuleId = 12;
        Intent intent = new Intent(HomeActivity.this, GifListVideoAndMyAlbumActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }



    public void videomirror() {
        Helper.ModuleId = 14;
        Intent intent = new Intent(HomeActivity.this, ListVideoAndMyAlbumActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
    public void videoreverse() {
        Helper.ModuleId = 16;
        Intent intent = new Intent(HomeActivity.this, ListVideoAndMyAlbumActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }

    public void fastmotion() {
        Helper.ModuleId = 9;
        Intent intent = new Intent(HomeActivity.this, ListVideoAndMyAlbumActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }

    public void slowmotion() {
        Helper.ModuleId = 10;
        Intent intent = new Intent(HomeActivity.this, ListVideoAndMyAlbumActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }

    public void videomute() {
        Helper.ModuleId = 5;
        Intent intent = new Intent(HomeActivity.this, ListVideoAndMyAlbumActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }

    public void videojoin() {
        Helper.ModuleId = 6;
        Intent intent = new Intent(HomeActivity.this,  com.glaxyappszone.videoeditor.creator.videojoiner.ListVideoAndMyAlbumActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
    public void videocutter() {
        Helper.ModuleId = 1;
        Intent intent = new Intent(HomeActivity.this, ListVideoAndMyAlbumActivity.class);

        startActivity(intent);
        finish();
    }

    public void videocrop() {
        Helper.ModuleId = 11;
        Intent intent = new Intent(HomeActivity.this, ListVideoAndMyAlbumActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    public void videorotate() {
        Helper.ModuleId = 13;
        Intent intent = new Intent(HomeActivity.this, ListVideoAndMyAlbumActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    public void videosplit() {
        Helper.ModuleId = 15;
        Intent intent = new Intent(HomeActivity.this, ListVideoAndMyAlbumActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
    public void videoformatchange() {
        Helper.ModuleId = 8;
        Intent intent = new Intent(HomeActivity.this, ListVideoAndMyAlbumActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
    public void videocompress() {
        Helper.ModuleId = 2;
        Intent intent = new Intent(HomeActivity.this, ListVideoAndMyAlbumActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }


    @Override
    protected void onResume() {

        //MyApplication.intrest_ad_is_loaded = true;
        super.onResume();
    }

    private void shareApp() {
        try {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.app_name));
            String shareMessage = "\nLet me recommend you this application\n\n";
            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            startActivity(Intent.createChooser(shareIntent, "choose one"));
        } catch (Exception e) {
            //e.toString();
        }
    }

}