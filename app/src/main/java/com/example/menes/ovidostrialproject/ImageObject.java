package com.example.menes.ovidostrialproject;

public class ImageObject extends Object {

        private String title;
        private int id;
        private String url;

        public String getTitle() {
            return title;
        }

        public int getId() {
            return id;
        }

        public String getUrl() {
            return url;
        }

        public ImageObject(String title, int id, String url)
        {
            super();
            this.title = title;
            this.id = id;
            this.url = url;
        }

}
