package com.ayd.ridif.floatingactionbuttonproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ridif on 10/11/2016.
 */

public class DataModelAdapter extends RecyclerView.Adapter<DataModelAdapter.MyViewHolder>
{
  private Context mContext;
  private List<DataModel> dataList;

  @Override
  public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
  {
    View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent,
        false);

    return new MyViewHolder(itemView);
  }

  @Override
  public void onBindViewHolder(MyViewHolder holder, int position)
  {
    DataModel dataModel = dataList.get(position);
    holder.name.setText(dataModel.getName());
    holder.desc.setText(dataModel.getDescription());
    holder.image.setImageResource(R.drawable.android);
  }

  @Override
  public int getItemCount()
  {
    return dataList.size();
  }

  public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView name, desc;
    public ImageView image;

    public MyViewHolder(View view) {
      super(view);
      name = (TextView) view.findViewById(R.id.textView);
      desc = (TextView) view.findViewById(R.id.textView2);
      image = (ImageView) view.findViewById(R.id.imageView);
    }
  }

  public DataModelAdapter(Context mContext, List<DataModel> dataModelList)
  {
    this.mContext = mContext;
    this.dataList = dataModelList;
  }
}
