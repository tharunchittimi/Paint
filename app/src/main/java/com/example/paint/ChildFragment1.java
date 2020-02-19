package com.example.paint;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChildFragment1 extends Fragment {

    static ChildFragment1 objChildFragment1;

    public static ChildFragment1 getInstance() {
        if (objChildFragment1 == null) {
            objChildFragment1 = new ChildFragment1();
        }
        return objChildFragment1;
    }

    ArrayList<DataItems> dataItems;

    ArrayList<DataTrending> dataTrending;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView1 = inflater.inflate(R.layout.chlid_fragment1, container, false);
        return rootView1;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        RecyclerView rv_data = view.findViewById(R.id.rv_data);
        dataItems = new ArrayList<>();

        RecyclerView rvTrending = view.findViewById(R.id.rvTrending);
        dataTrending = new ArrayList<>();

        dataTrending.add(new DataTrending("Wall Art", R.drawable.wallart));
        dataTrending.add(new DataTrending("Wall Stencils", R.drawable.stencils));
        dataTrending.add(new DataTrending("Wall paper", R.drawable.wallpaper));
        dataTrending.add(new DataTrending("Textures", R.drawable.textures));
        dataTrending.add(new DataTrending("Colour", R.drawable.colour));
        dataTrending.add(new DataTrending("Wall Art", R.drawable.wallart));
        dataTrending.add(new DataTrending("Wall Stencils", R.drawable.stencils));
        dataTrending.add(new DataTrending("Wall paper", R.drawable.wallpaper));
        dataTrending.add(new DataTrending("Textures", R.drawable.textures));
        dataTrending.add(new DataTrending("Colour", R.drawable.colour));
        dataTrending.add(new DataTrending("Wall Stencils", R.drawable.stencils));
        dataTrending.add(new DataTrending("Wall Art", R.drawable.wallart));
        dataTrending.add(new DataTrending("Wall paper", R.drawable.wallpaper));
        dataTrending.add(new DataTrending("Textures", R.drawable.textures));

        dataItems.add(new DataItems("Cafe Coffee", R.drawable.cafe));
        dataItems.add(new DataItems("Restaurant", R.drawable.mcdonald));
        dataItems.add(new DataItems("Work Space", R.drawable.cafe));
        dataItems.add(new DataItems("Cafe Coffee", R.drawable.exterior));
        dataItems.add(new DataItems("Domino's", R.drawable.interior));
        dataItems.add(new DataItems("Restaurant", R.drawable.cafe));
        dataItems.add(new DataItems("Cafe Coffee", R.drawable.cafe));
        dataItems.add(new DataItems("Restaurant", R.drawable.mcdonald));
        dataItems.add(new DataItems("Work Space", R.drawable.cafe));
        dataItems.add(new DataItems("Cafe Coffee", R.drawable.exterior));
        dataItems.add(new DataItems("Domino's", R.drawable.interior));
        dataItems.add(new DataItems("Restaurant", R.drawable.cafe));

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        rvTrending.setLayoutManager(gridLayoutManager);
        ItemOffsetDecoration itemOffsetDecoration = new ItemOffsetDecoration(getContext(), R.dimen.item_offset);
        rvTrending.addItemDecoration(itemOffsetDecoration);
        TrendingAdapter objCustomAdapter1 = new TrendingAdapter(dataTrending);
        rvTrending.setAdapter(objCustomAdapter1);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rv_data.setLayoutManager(linearLayoutManager);
        ItemOffsetDecoration itemOffsetDecoration1 = new ItemOffsetDecoration(getContext(), R.dimen.item_offset1);
        rv_data.addItemDecoration(itemOffsetDecoration1);
        CustomAdapter1 objCustomAdapter = new CustomAdapter1(dataItems);
        rv_data.setAdapter(objCustomAdapter);
    }

    public class ItemOffsetDecoration extends RecyclerView.ItemDecoration {
        private int mItemOffset;

        public ItemOffsetDecoration(int itemOffset) {
            mItemOffset = itemOffset;
        }

        public ItemOffsetDecoration(@NonNull Context context, @DimenRes int itemOffsetId) {
            this(context.getResources().getDimensionPixelSize(itemOffsetId));
        }

        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent,
                                   @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(mItemOffset, mItemOffset, mItemOffset, mItemOffset);
        }
    }

}
