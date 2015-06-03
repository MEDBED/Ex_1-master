package com.iit.ex1.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.iit.ex1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    //private ImageView mMainImage;
    private ImageView mHatImage;
    private ImageView mChal8oumImage;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        initViews(view);

        // Inflate the layout for this fragment
        return view;

    }

    private void initViews(View view) {
        //mMainImage = (ImageView) view.findViewById(R.id.imageview1);
        //mMainImage.setImageResource(R.drawable.main_photo);
        mHatImage = (ImageView) view.findViewById(R.id.hat_image);
        mChal8oumImage = (ImageView) view.findViewById(R.id.chal8oum);

    }

    public void setComponent(int controlId) {
        switch (controlId) {
            case R.id.radio_button_hat_none:
                mHatImage.setVisibility(View.GONE);
                break;
            case R.id.radio_button_hat_panama:
                mHatImage.setVisibility(View.VISIBLE);
                mHatImage.setImageResource(R.drawable.chapeau_1);
                break;
            case R.id.radio_button_hat_none2:
                mChal8oumImage.setVisibility(View.GONE);
                break;
            case R.id.radio_button_hat_panama2:
                mChal8oumImage.setVisibility(View.VISIBLE);
                mChal8oumImage.setImageResource(R.drawable.chal8oum);
                break;
        }

    }


}
