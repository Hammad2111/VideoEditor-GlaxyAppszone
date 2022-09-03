package com.glaxyappszone.videoeditor.creator.listvideoandmyvideo;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import com.glaxyappszone.videoeditor.creator.BuildConfig;
import com.glaxyappszone.videoeditor.creator.Helper;
import com.glaxyappszone.videoeditor.creator.HomeActivity;
import com.glaxyappszone.videoeditor.creator.R;

import java.util.ArrayList;
import java.util.List;

public class ListVideoAndMyAlbumActivity extends AppCompatActivity {
    static final boolean a = true;
    private TabLayout b;
    private ViewPager c;
    private int[] d = {R.mipmap.icon_video, R.mipmap.icon_myalbum};

    class a extends FragmentPagerAdapter {
        private final List<Fragment> b = new ArrayList();
        private final List<String> c = new ArrayList();

        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        public Fragment getItem(int i) {
            return (Fragment) this.b.get(i);
        }

        public int getCount() {
            return this.b.size();
        }

        public void a(Fragment fragment, String str) {
            this.b.add(fragment);
            this.c.add(str);
        }

        public CharSequence getPageTitle(int i) {
            return (CharSequence) this.c.get(i);
        }
    }

    @Override public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView( R.layout.liststatusactivity);



      /*  LinearLayout banner = findViewById(R.id.banner_vcard);
        AdsUtility.loadAdmobBanner(this, banner);
*/


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView textView = (TextView) toolbar.findViewById(R.id.toolbar_title);
        if (Helper.ModuleId == 1) {
            textView.setText("Video Cutter");
        } else if (Helper.ModuleId == 2) {
            textView.setText("Video Compressor");
        } else if (Helper.ModuleId == 4) {
            textView.setText("Audio Video Mixer");
        } else if (Helper.ModuleId == 5) {
            textView.setText("Video Mute");
        } else if (Helper.ModuleId == 6) {
            textView.setText("Video Joiner");
        }else if (Helper.ModuleId == 8) {
            textView.setText("Video Converter");
        } else if (Helper.ModuleId == 9) {
            textView.setText("Fast Motion Video");
        } else if (Helper.ModuleId == 10) {
            textView.setText("Slow Motion Video");
        } else if (Helper.ModuleId == 11) {
            textView.setText("Video Croper");
        } else if (Helper.ModuleId == 13) {
            textView.setText("Video Rotate");
        } else if (Helper.ModuleId == 14) {
            textView.setText("Video Mirror");
        } else if (Helper.ModuleId == 15) {
            textView.setText("Video Splitter");
        } else if (Helper.ModuleId == 16) {
            textView.setText("Video Reverse");
        } else if (Helper.ModuleId == 22) {
            textView.setText("Video Watermark");
        }
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (a || supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(a);
            supportActionBar.setDisplayShowTitleEnabled(false);
            this.c = (ViewPager) findViewById(R.id.viewpager);
            a(this.c);
            this.b = (TabLayout) findViewById(R.id.tabs);

            this.b.setupWithViewPager(this.c);
            a();
            return;
        }
        throw new AssertionError();
    }

    private void a() {
        this.b.getTabAt(0).setIcon(this.d[0]);
        this.b.getTabAt(1).setIcon(this.d[1]);
    }

    private void a(ViewPager viewPager) {
        a aVar = new a(getSupportFragmentManager());
        aVar.a(new SelectVideoFragment(), "VIDEO");
        aVar.a(new MyVideoFragment(), "MY ALBUM");
        viewPager.setAdapter(aVar);
    }

    @SuppressLint("WrongConstant")
    @Override public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
        intent.setFlags(67108864);
        startActivity(intent);
        finish();
        super.onBackPressed();
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return a;
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



   @Override public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return a;
        }
        if (itemId == R.id.shareapp) {
            shareApp();
        }  else if (itemId == R.id.rateus) {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + BuildConfig.APPLICATION_ID)));
            } catch (ActivityNotFoundException unused2) {
                Toast.makeText(getApplicationContext(), " unable to find market app", Toast.LENGTH_LONG).show();
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean isOnline() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        if (connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting()) {
            return false;
        }
        return a;
    }
}
