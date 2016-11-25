package com.labs.rucker.concerttracker;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Carlview.loadUrl(ticketURL);os on 7/22/2016.
 */
public class MainActivityTickets extends AppCompatActivity {

    private String ticketURL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tickets);

        WebView view = (WebView) this.findViewById(R.id.webView);
         String UA = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0";
        //Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0
        WebSettings webSettings = new WebSettings() {
            @Override
            public void setSupportZoom(boolean support) {

            }

            @Override
            public boolean supportZoom() {
                return false;
            }

            @Override
            public void setMediaPlaybackRequiresUserGesture(boolean require) {

            }

            @Override
            public boolean getMediaPlaybackRequiresUserGesture() {
                return false;
            }

            @Override
            public void setBuiltInZoomControls(boolean enabled) {

            }

            @Override
            public boolean getBuiltInZoomControls() {
                return false;
            }

            @Override
            public void setDisplayZoomControls(boolean enabled) {

            }

            @Override
            public boolean getDisplayZoomControls() {
                return false;
            }

            @Override
            public void setAllowFileAccess(boolean allow) {

            }

            @Override
            public boolean getAllowFileAccess() {
                return false;
            }

            @Override
            public void setAllowContentAccess(boolean allow) {

            }

            @Override
            public boolean getAllowContentAccess() {
                return false;
            }

            @Override
            public void setLoadWithOverviewMode(boolean overview) {

            }

            @Override
            public boolean getLoadWithOverviewMode() {
                return false;
            }

            @Override
            public void setEnableSmoothTransition(boolean enable) {

            }

            @Override
            public boolean enableSmoothTransition() {
                return false;
            }

            @Override
            public void setSaveFormData(boolean save) {

            }

            @Override
            public boolean getSaveFormData() {
                return false;
            }

            @Override
            public void setSavePassword(boolean save) {

            }

            @Override
            public boolean getSavePassword() {
                return false;
            }

            @Override
            public void setTextZoom(int textZoom) {

            }

            @Override
            public int getTextZoom() {
                return 0;
            }

            @Override
            public void setDefaultZoom(ZoomDensity zoom) {

            }

            @Override
            public ZoomDensity getDefaultZoom() {
                return null;
            }

            @Override
            public void setLightTouchEnabled(boolean enabled) {

            }

            @Override
            public boolean getLightTouchEnabled() {
                return false;
            }

            @Override
            public void setUseWideViewPort(boolean use) {

            }

            @Override
            public boolean getUseWideViewPort() {
                return false;
            }

            @Override
            public void setSupportMultipleWindows(boolean support) {

            }

            @Override
            public boolean supportMultipleWindows() {
                return false;
            }

            @Override
            public void setLayoutAlgorithm(LayoutAlgorithm l) {

            }

            @Override
            public LayoutAlgorithm getLayoutAlgorithm() {
                return null;
            }

            @Override
            public void setStandardFontFamily(String font) {

            }

            @Override
            public String getStandardFontFamily() {
                return null;
            }

            @Override
            public void setFixedFontFamily(String font) {

            }

            @Override
            public String getFixedFontFamily() {
                return null;
            }

            @Override
            public void setSansSerifFontFamily(String font) {

            }

            @Override
            public String getSansSerifFontFamily() {
                return null;
            }

            @Override
            public void setSerifFontFamily(String font) {

            }

            @Override
            public String getSerifFontFamily() {
                return null;
            }

            @Override
            public void setCursiveFontFamily(String font) {

            }

            @Override
            public String getCursiveFontFamily() {
                return null;
            }

            @Override
            public void setFantasyFontFamily(String font) {

            }

            @Override
            public String getFantasyFontFamily() {
                return null;
            }

            @Override
            public void setMinimumFontSize(int size) {

            }

            @Override
            public int getMinimumFontSize() {
                return 0;
            }

            @Override
            public void setMinimumLogicalFontSize(int size) {

            }

            @Override
            public int getMinimumLogicalFontSize() {
                return 0;
            }

            @Override
            public void setDefaultFontSize(int size) {

            }

            @Override
            public int getDefaultFontSize() {
                return 0;
            }

            @Override
            public void setDefaultFixedFontSize(int size) {

            }

            @Override
            public int getDefaultFixedFontSize() {
                return 0;
            }

            @Override
            public void setLoadsImagesAutomatically(boolean flag) {

            }

            @Override
            public boolean getLoadsImagesAutomatically() {
                return false;
            }

            @Override
            public void setBlockNetworkImage(boolean flag) {

            }

            @Override
            public boolean getBlockNetworkImage() {
                return false;
            }

            @Override
            public void setBlockNetworkLoads(boolean flag) {

            }

            @Override
            public boolean getBlockNetworkLoads() {
                return false;
            }

            @Override
            public void setJavaScriptEnabled(boolean flag) {

            }

            @Override
            public void setAllowUniversalAccessFromFileURLs(boolean flag) {

            }

            @Override
            public void setAllowFileAccessFromFileURLs(boolean flag) {

            }

            @Override
            public void setPluginState(PluginState state) {

            }

            @Override
            public void setDatabasePath(String databasePath) {

            }

            @Override
            public void setGeolocationDatabasePath(String databasePath) {

            }

            @Override
            public void setAppCacheEnabled(boolean flag) {

            }

            @Override
            public void setAppCachePath(String appCachePath) {

            }

            @Override
            public void setAppCacheMaxSize(long appCacheMaxSize) {

            }

            @Override
            public void setDatabaseEnabled(boolean flag) {

            }

            @Override
            public void setDomStorageEnabled(boolean flag) {

            }

            @Override
            public boolean getDomStorageEnabled() {
                return false;
            }

            @Override
            public String getDatabasePath() {
                return null;
            }

            @Override
            public boolean getDatabaseEnabled() {
                return false;
            }

            @Override
            public void setGeolocationEnabled(boolean flag) {

            }

            @Override
            public boolean getJavaScriptEnabled() {
                return false;
            }

            @Override
            public boolean getAllowUniversalAccessFromFileURLs() {
                return false;
            }

            @Override
            public boolean getAllowFileAccessFromFileURLs() {
                return false;
            }

            @Override
            public PluginState getPluginState() {
                return null;
            }

            @Override
            public void setJavaScriptCanOpenWindowsAutomatically(boolean flag) {

            }

            @Override
            public boolean getJavaScriptCanOpenWindowsAutomatically() {
                return false;
            }

            @Override
            public void setDefaultTextEncodingName(String encoding) {

            }

            @Override
            public String getDefaultTextEncodingName() {
                return null;
            }

            @Override
            public void setUserAgentString(String ua) {

            }

            @Override
            public String getUserAgentString() {
                return null;
            }

            @Override
            public void setNeedInitialFocus(boolean flag) {

            }

            @Override
            public void setRenderPriority(RenderPriority priority) {

            }

            @Override
            public void setCacheMode(int mode) {

            }

            @Override
            public int getCacheMode() {
                return 0;
            }

            @Override
            public void setMixedContentMode(int mode) {

            }

            @Override
            public int getMixedContentMode() {
                return 0;
            }

            @Override
            public void setOffscreenPreRaster(boolean enabled) {

            }

            @Override
            public boolean getOffscreenPreRaster() {
                return false;
            }
        };
        view.getSettings().setJavaScriptEnabled(true);
//
//        view.getSettings().setJavaScriptEnabled(true);
      view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(true);
            view.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        view.getSettings().setDomStorageEnabled(true);
        view.setWebChromeClient(new WebChromeClient());
        view.getSettings().setSupportZoom(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setDisplayZoomControls(false);
        view.getSettings().setGeolocationEnabled(true);



        view.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        view.setScrollbarFadingEnabled(false);
                view.getSettings().setUserAgentString(UA);
    webSettings.setUserAgentString(UA);
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                //newString= null;

            } else {

                ticketURL = extras
                        .getString("WEB");

            }
        } else {
            ticketURL = (String) savedInstanceState.getSerializable("WEB");
        }

//
        view.setWebViewClient(new WebViewClient());
        Uri uri = Uri.parse(ticketURL).normalizeScheme();

        Log.d("WebViewURL", ticketURL);
//        view.loadUrl(ticketURL);


        ////////////////////////////////////////

        URLConnection con = null;
        try {
            con = new URL(ticketURL).openConnection();
            System.out.println("Orignal URL: " + con.getURL());
            con.connect();
            System.out.println("Connected URL: " + con.getURL());
            InputStream is = con.getInputStream();
            System.out.println("Redirected URL: " + con.getURL());
            String neoURL = con.getURL().toString();
            is.close();
                 /*
       BROWSER ATTEMPT
        */
            //Intent browserIntent = new Intent();
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse(neoURL));
            startActivity(browserIntent);
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
    private class AsyncTaskRunner extends AsyncTask<String, String, Void> {

        private String resp;
        ProgressDialog progressDialog;

        @Override
        protected Void doInBackground(String... params) {

            URLConnection con = null;
            try {
                con = new URL(ticketURL).openConnection();
                System.out.println("Orignal URL: " + con.getURL());
                con.connect();
                System.out.println("Connected URL: " + con.getURL());
                InputStream is = con.getInputStream();
                System.out.println("Redirected URL: " + con.getURL());
                String neoURL = con.getURL().toString();
                is.close();
                 /*
       BROWSER ATTEMPT
        */
                //Intent browserIntent = new Intent();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(neoURL));
                startActivity(browserIntent);
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }


        @Override
        protected void onPostExecute(Void result) {

        }


        @Override
        protected void onPreExecute() {
        }


        @Override
        protected void onProgressUpdate(String... text) {


        }
    }



}
