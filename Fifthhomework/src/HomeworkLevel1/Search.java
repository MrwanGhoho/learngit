package HomeworkLevel1;

import java.io.*;

/**
 * Created by asus on 2016/11/18.
 */
public class Search implements Runnable {



    /**
     * Created by asus on 2016/11/17.
     */

        Thread Go;
        String Keywords;
        String Catalog;
        File str1;
        BufferedInputStream str2;
        public Search(String catalog,String keywords) throws IOException {
            this.Catalog=catalog;
            this.Keywords=keywords;
            start(catalog,keywords);
            str2.close();
        }

        public  void run() {

            str1=new File(this.Catalog);
            File [] file=str1.listFiles();

            if (!str1.exists()){
                throw new IllegalArgumentException("目录不存在");
            }
            if (file.length==0){
                throw new IllegalArgumentException("目录为空");
            }



            for (int i=0;i<file.length;i++){
                if (file[i].isFile()){
                    String name=file[i].getName();
                    if (name.contains(Keywords)){
                        System.out.println((i+1)+" "+file[i].getAbsolutePath()+" ");
                        try {
                            str2=new BufferedInputStream(new FileInputStream(file[i].getAbsolutePath()));
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                        try {
                            str2.read();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } else if (file[i].isDirectory()){
                    this.Catalog=file[i].getAbsolutePath();
                    run();
                }


            }

            try {
                str2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public void start(String catalog,String keywords) {
            this.Keywords=keywords;
            this.Catalog=catalog;
            if (Go == null) {
                Go = new Thread(this, "work");
                Go.start();
            }
        }


    }


