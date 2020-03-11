package com.example.paint.dashboardfragments.fragmentcost;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.paint.R;
import com.example.paint.userprofile.UserDetails;
import com.example.paint.dashboard.HomeScreen;

public class FragmentCost extends Fragment {
    private SeekBar seekBar;
    Context context;

//    private static FragmentCost objFragmentCost;
//
//    public static FragmentCost getInstance(){
//
//        if(objFragmentCost==null){
//            objFragmentCost= new FragmentCost();
//        }
//        return objFragmentCost;
//    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v4 = inflater.inflate(R.layout.activity_fragment_cost, container, false);
        return v4;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        final TextView txt2 = view.findViewById(R.id.Txt2);
        final TextView txt3 = view.findViewById(R.id.Txt3);
        final TextView txt4 = view.findViewById(R.id.Txt4);
        final TextView txt5 = view.findViewById(R.id.Txt5);

        seekBar = view.findViewById(R.id.seekbar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                showToast("seekbar progress: " + progress);
                if (progress <= 20) {
                    txt2.setTextColor(getResources().getColor(R.color.actBar));
                } else {
                    txt2.setTextColor(getResources().getColor(R.color.Black));
                }
                if (progress >21 && progress <=55) {
                    txt3.setTextColor(getResources().getColor(R.color.actBar));
                } else {
                    txt3.setTextColor(getResources().getColor(R.color.Black));
                }
                if (progress >55 && progress<=80) {
                    txt4.setTextColor(getResources().getColor(R.color.actBar));
                } else {
                    txt4.setTextColor(getResources().getColor(R.color.Black));
                }
                if (progress <= 80) {
                    txt5.setTextColor(getResources().getColor(R.color.Black));
                } else {
                    txt5.setTextColor(getResources().getColor(R.color.actBar));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar.setProgress(10);
            }
        });
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar.setProgress(30);

            }
        });
        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar.setProgress(56);

            }
        });
        txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar.setProgress(100);

            }
        });

        final TextView textView = view.findViewById(R.id.Txt6);
        final TextView textView1 = view.findViewById(R.id.Txtt6);
        Switch ttt = view.findViewById(R.id.switch1);

        ttt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView.setTextColor(getResources().getColor(R.color.greyBrown));
                    textView1.setTextColor(getResources().getColor(R.color.actBar));
                } else {
                    textView.setTextColor(getResources().getColor(R.color.actBar));
                    textView1.setTextColor(getResources().getColor(R.color.greyBrown));
                }
            }
        });

        final TextView txtt1 = view.findViewById(R.id.Txtt);
        final TextView txtt2 = view.findViewById(R.id.Txtt1);
        final TextView txtt3 = view.findViewById(R.id.Txtt2);

        txtt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtt1.setBackgroundResource(R.drawable.border);
                txtt1.setTextColor(getResources().getColor(R.color.Black));

                txtt2.setBackgroundResource(R.drawable.border1);
                txtt2.setTextColor(getResources().getColor(R.color.light_grey));

                txtt3.setBackgroundResource(R.drawable.border1);
                txtt3.setTextColor(getResources().getColor(R.color.light_grey));

            }
        });
        txtt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtt2.setBackgroundResource(R.drawable.border);
                txtt2.setTextColor(getResources().getColor(R.color.Black));

                txtt1.setBackgroundResource(R.drawable.border1);
                txtt1.setTextColor(getResources().getColor(R.color.light_grey));

                txtt3.setBackgroundResource(R.drawable.border1);
                txtt3.setTextColor(getResources().getColor(R.color.light_grey));
            }
        });
        txtt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtt3.setBackgroundResource(R.drawable.border);
                txtt3.setTextColor(getResources().getColor(R.color.Black));

                txtt2.setBackgroundResource(R.drawable.border1);
                txtt2.setTextColor(getResources().getColor(R.color.light_grey));

                txtt1.setBackgroundResource(R.drawable.border1);
                txtt1.setTextColor(getResources().getColor(R.color.light_grey));
            }
        });

        final TextView txt8 = view.findViewById(R.id.Txt8);
        final TextView txt9 = view.findViewById(R.id.Txt9);
        final TextView txt10 = view.findViewById(R.id.Txt10);
        final TextView txt11 = view.findViewById(R.id.Txt11);

        txt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt8.setBackgroundResource(R.drawable.border);
                txt9.setTextColor(getResources().getColor(R.color.Black));

                txt10.setBackgroundResource(R.drawable.border1);
                txt11.setTextColor(getResources().getColor(R.color.light_grey));
            }
        });

        txt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt10.setBackgroundResource(R.drawable.border);
                txt11.setTextColor(getResources().getColor(R.color.Black));

                txt8.setBackgroundResource(R.drawable.border1);
                txt9.setTextColor(getResources().getColor(R.color.light_grey));
            }
        });

        Button costBtn = view.findViewById(R.id.costBtn);
        costBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = v.getContext();
                Intent i = new Intent(context, UserDetails.class);
                context.startActivity(i);
            }
        });
    }

    private void showToast(String s) {
        Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
    }

//    @Override
//    public void onPrepareOptionsMenu(Menu menu) {
//        MenuItem item=menu.findItem(R.id.men_search);
//        if(item!=null)
//            item.setVisible(false);
//    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((HomeScreen) getActivity()).hideImageIconSearch();
    }
}