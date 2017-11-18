package id.co.blogbasbas.wisataiak;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class DaftarWisataFragment extends Fragment {

    RecyclerView list;
    public DaftarWisataFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_daftar_wisata, container, false);


        list = (RecyclerView) view.findViewById(R.id.recyclerview);

        list.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        AdapterRecycler adapter = new AdapterRecycler(getActivity());
        list.setAdapter(adapter);

        return view;
    }

}
