package com.ayd.ridif.floatingactionbuttonproject;

/**
 * Created by Ridif on 10/11/2016.
 */

public class DataModel
{
  private String mName;
  private String mDescription;
  private int mImageResourceID;

  public DataModel(String name, String description, int imageResourceID)
  {
    mName = name;
    mDescription = description;
    mImageResourceID = imageResourceID;
  }

  public String getName()
  {
    return mName;
  }

  public String getDescription()
  {
    return mDescription;
  }

  public int getImageResourceID()
  {
    return mImageResourceID;
  }
}
