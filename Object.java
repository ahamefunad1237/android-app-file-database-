package database.android

public final class Object {
   public String mdata;
   public int mdatalength;

  public Object(String mdata,int mdatalength){
     this.mdata = mdata;
     this.mdatalength = mdatalength;

     if(!mdata.equals("")){
        mdatalength = mdata.length();
     }
  }

   public int getDataString(){
      if(mdatalength > 0){
         return mdatalength
      }
      return 0
   }
}
