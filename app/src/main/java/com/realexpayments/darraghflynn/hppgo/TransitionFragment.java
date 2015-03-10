package com.bignerdranch.android.transitionexample;

import android.app.Fragment;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class TransitionFragment extends Fragment {

    public TransitionFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_transition_scene_1, container, false);
        final Scene scene = Scene.getSceneForLayout(container, R.layout.fragment_transition_scene_2, getActivity());
        Button goButton = (Button)rootView.findViewById(R.id.goButton);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.go(scene);
                WebView browser = (WebView)rootView.findViewById(R.id.webview);
                browser.loadUrl("www.google.com");
                Log.d("","Here");
            }
        });
        return rootView;
    }
}
