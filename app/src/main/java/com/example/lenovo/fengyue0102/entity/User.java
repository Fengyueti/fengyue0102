package com.example.lenovo.fengyue0102.entity;

import java.util.List;

public class User {
    public String msg;
    public String code;
    public Data data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data{
        public List<TJ> tuijian;

        public List<TJ> getTuijian() {
            return tuijian;
        }

        public void setTuijian(List<TJ> tuijian) {
            this.tuijian = tuijian;
        }

        public class TJ{
            public int pid;
            public String title;
            public double price;
            public String images;

            public String getImages() {
                return images;
            }

            public void setImages(String images) {
                this.images = images;
            }

            public int getPid() {
                return pid;
            }

            public void setPid(int pid) {
                this.pid = pid;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }
        }
    }
}
