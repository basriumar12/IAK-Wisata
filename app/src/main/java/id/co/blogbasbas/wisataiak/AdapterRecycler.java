package id.co.blogbasbas.wisataiak;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Server on 18/11/2017.
 */

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.MyHolder> {

    String nama [] = {"TUgu Monas",
            "Lobang Buaya", "Kota Tua",
            "TMII", "Taman Ancol"};
    int gambar [] = {R.drawable.boliyohutuo,
            R.drawable.bugisa,
            R.drawable.boliyohutuo,
            R.drawable.gorontalo,
            R.drawable.otanaha};
    String detail[] = {"TUgu f sfs fsf sf Monas TUgu f sfs fsf sf Monas TUgu f sfs fsf sf Monas TUgu f sfs fsf sf Monas",
            "Lobang Buaya fsfsf fsf Lobang Buaya fsfsf fsf Lobang Buaya fsfsf fsf Lobang Buaya fsfsf fsf Lobang Buaya fsfsf fsf",
            "Kota Tusfsfsf fsfsfa Kota Tusfsfsf fsfsfa Kota Tusfsfsf fsfsfa Kota Tusfsfsf fsfsfa Kota Tusfsfsf fsfsfa",
            "sfsfs f sfsf sfsf TMII sfsfs f sfsf sfsf TMII sfsfs f sfsf sfsf TMIIsfsfs f sfsf sfsf TMII",
            "Taman Ancolsfsfsff Taman Ancolsfsfsff Taman AncolsfsfsffTaman Ancolsfsfsff"};


    Context context;
    LayoutInflater layoutInflater;
    public AdapterRecycler(Context context) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public AdapterRecycler.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate( R.layout.list_item, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(AdapterRecycler.MyHolder holder, final int position) {
        holder.txt.setText(nama[position]);
        holder.img.setImageResource(gambar[position]);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kirimData =
                        new Intent(context, DetailActivity.class);
                kirimData.putExtra("NAMA", nama[position]);
                kirimData.putExtra("IMG", gambar[position]);
                kirimData.putExtra("DET", detail[position]);

                context.startActivity(kirimData);

            }
        });



    }

    @Override
    public int getItemCount() {
        return nama.length;
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;

        public MyHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.imgwisata);
            txt = (TextView) itemView.findViewById(R.id.txtnama);
        }
    }
}
