package dv.android.com.recyclerviewdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {

    private List<String> dataList;

    public AdapterDatos(List<String> dataList) {
        this.dataList = dataList;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_list,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos viewHolderDatos, int i) {
        viewHolderDatos.asignarDatos(dataList.get(i));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        private TextView datos;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);

            datos = itemView.findViewById(R.id.idDatos);
        }

        public void asignarDatos(String s) {
            datos.setText(s);
        }
    }
}
