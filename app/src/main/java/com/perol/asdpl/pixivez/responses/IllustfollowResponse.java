package com.perol.asdpl.pixivez.responses;

import java.io.Serializable;
import java.util.List;

/**
 * Created by asdpl on 2018/2/14.
 */

public class IllustfollowResponse {

    /**
     * illusts : [{"id":57860709,"title":"桜内梨子","type":"illust","image_urls":{"square_medium":"https://i.pximg.net/c/360x360_70/img-master/img/2016/07/11/22/48/19/57860709_p0_square1200.jpg","medium":"https://i.pximg.net/c/540x540_70/img-master/img/2016/07/11/22/48/19/57860709_p0_master1200.jpg","large":"https://i.pximg.net/c/600x1200_90/img-master/img/2016/07/11/22/48/19/57860709_p0_master1200.jpg"},"caption":"Sakurauchi Riko R18 beastiality fanart","restrict":0,"user":{"id":4338012,"name":"【hews】 @hews__","account":"hews","profile_image_urls":{"medium":"https://i3.pixiv.net/user-profile/img/2016/05/20/15/03/14/10955482_ac31f12ab54a78f8391b8293ee642cee_170.png"},"is_followed":true},"tags":[{"name":"R-18"},{"name":"桜内梨子"},{"name":"ラブライブ!サンシャイン!!"},{"name":"獣姦"}],"tools":["Photoshop","SAI"],"create_date":"2016-07-11T22:48:19+09:00","page_count":3,"width":1125,"height":825,"sanity_level":6,"meta_single_page":{},"meta_pages":[{"image_urls":{"square_medium":"https://i.pximg.net/c/360x360_70/img-master/img/2016/07/11/22/48/19/57860709_p0_square1200.jpg","medium":"https://i.pximg.net/c/540x540_70/img-master/img/2016/07/11/22/48/19/57860709_p0_master1200.jpg","large":"https://i.pximg.net/c/600x1200_90/img-master/img/2016/07/11/22/48/19/57860709_p0_master1200.jpg","original":"https://i2.pixiv.net/img-original/img/2016/07/11/22/48/19/57860709_p0.jpg"}},{"image_urls":{"square_medium":"https://i.pximg.net/c/360x360_70/img-master/img/2016/07/11/22/48/19/57860709_p1_square1200.jpg","medium":"https://i.pximg.net/c/540x540_70/img-master/img/2016/07/11/22/48/19/57860709_p1_master1200.jpg","large":"https://i.pximg.net/c/600x1200_90/img-master/img/2016/07/11/22/48/19/57860709_p1_master1200.jpg","original":"https://i2.pixiv.net/img-original/img/2016/07/11/22/48/19/57860709_p1.jpg"}},{"image_urls":{"square_medium":"https://i.pximg.net/c/360x360_70/img-master/img/2016/07/11/22/48/19/57860709_p2_square1200.jpg","medium":"https://i.pximg.net/c/540x540_70/img-master/img/2016/07/11/22/48/19/57860709_p2_master1200.jpg","large":"https://i.pximg.net/c/600x1200_90/img-master/img/2016/07/11/22/48/19/57860709_p2_master1200.jpg","original":"https://i2.pixiv.net/img-original/img/2016/07/11/22/48/19/57860709_p2.jpg"}}],"total_view":5836,"total_bookmarks":213,"is_bookmarked":false,"visible":true}]
     * next_url : https://app-api.pixiv.net/v2/illust/follow?restrict=public&offset=30
     */

    private String next_url;
    private List<IllustsBean> illusts;

    public String getNext_url() {
        return next_url;
    }

    public void setNext_url(String next_url) {
        this.next_url = next_url;
    }

    public List<IllustsBean> getIllusts() {
        return illusts;
    }

    public void setIllusts(List<IllustsBean> illusts) {
        this.illusts = illusts;
    }

//    public static class IllustsBean {
//        /**
//         * id : 57860709
//         * title : 桜内梨子
//         * type : illust
//         * image_urls : {"square_medium":"https://i.pximg.net/c/360x360_70/img-master/img/2016/07/11/22/48/19/57860709_p0_square1200.jpg","medium":"https://i.pximg.net/c/540x540_70/img-master/img/2016/07/11/22/48/19/57860709_p0_master1200.jpg","large":"https://i.pximg.net/c/600x1200_90/img-master/img/2016/07/11/22/48/19/57860709_p0_master1200.jpg"}
//         * caption : Sakurauchi Riko R18 beastiality fanart
//         * restrict : 0
//         * user : {"id":4338012,"name":"【hews】 @hews__","account":"hews","profile_image_urls":{"medium":"https://i3.pixiv.net/user-profile/img/2016/05/20/15/03/14/10955482_ac31f12ab54a78f8391b8293ee642cee_170.png"},"is_followed":true}
//         * tags : [{"name":"R-18"},{"name":"桜内梨子"},{"name":"ラブライブ!サンシャイン!!"},{"name":"獣姦"}]
//         * tools : ["Photoshop","SAI"]
//         * create_date : 2016-07-11T22:48:19+09:00
//         * page_count : 3
//         * width : 1125
//         * height : 825
//         * sanity_level : 6
//         * meta_single_page : {}
//         * meta_pages : [{"image_urls":{"square_medium":"https://i.pximg.net/c/360x360_70/img-master/img/2016/07/11/22/48/19/57860709_p0_square1200.jpg","medium":"https://i.pximg.net/c/540x540_70/img-master/img/2016/07/11/22/48/19/57860709_p0_master1200.jpg","large":"https://i.pximg.net/c/600x1200_90/img-master/img/2016/07/11/22/48/19/57860709_p0_master1200.jpg","original":"https://i2.pixiv.net/img-original/img/2016/07/11/22/48/19/57860709_p0.jpg"}},{"image_urls":{"square_medium":"https://i.pximg.net/c/360x360_70/img-master/img/2016/07/11/22/48/19/57860709_p1_square1200.jpg","medium":"https://i.pximg.net/c/540x540_70/img-master/img/2016/07/11/22/48/19/57860709_p1_master1200.jpg","large":"https://i.pximg.net/c/600x1200_90/img-master/img/2016/07/11/22/48/19/57860709_p1_master1200.jpg","original":"https://i2.pixiv.net/img-original/img/2016/07/11/22/48/19/57860709_p1.jpg"}},{"image_urls":{"square_medium":"https://i.pximg.net/c/360x360_70/img-master/img/2016/07/11/22/48/19/57860709_p2_square1200.jpg","medium":"https://i.pximg.net/c/540x540_70/img-master/img/2016/07/11/22/48/19/57860709_p2_master1200.jpg","large":"https://i.pximg.net/c/600x1200_90/img-master/img/2016/07/11/22/48/19/57860709_p2_master1200.jpg","original":"https://i2.pixiv.net/img-original/img/2016/07/11/22/48/19/57860709_p2.jpg"}}]
//         * total_view : 5836
//         * total_bookmarks : 213
//         * is_bookmarked : false
//         * visible : true
//         */
//
//        private int id;
//        private String title;
//        private String type;
//        private ImageUrlsBean image_urls;
//        private String caption;
//        private int restrict;
//        private UserBean user;
//        private String create_date;
//        private int page_count;
//        private int width;
//        private int height;
//        private int sanity_level;
//        private MetaSinglePageBean meta_single_page;
//        private int total_view;
//        private int total_bookmarks;
//        private boolean is_bookmarked;
//        private boolean visible;
//        private List<TagsBean> tags;
//        private List<String> tools;
//        private List<MetaPagesBean> meta_pages;
//
//        public int getId() {
//            return id;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public void setTitle(String title) {
//            this.title = title;
//        }
//
//        public String getType() {
//            return type;
//        }
//
//        public void setType(String type) {
//            this.type = type;
//        }
//
//        public ImageUrlsBean getImage_urls() {
//            return image_urls;
//        }
//
//        public void setImage_urls(ImageUrlsBean image_urls) {
//            this.image_urls = image_urls;
//        }
//
//        public String getCaption() {
//            return caption;
//        }
//
//        public void setCaption(String caption) {
//            this.caption = caption;
//        }
//
//        public int getRestrict() {
//            return restrict;
//        }
//
//        public void setRestrict(int restrict) {
//            this.restrict = restrict;
//        }
//
//        public UserBean getUser() {
//            return user;
//        }
//
//        public void setUser(UserBean user) {
//            this.user = user;
//        }
//
//        public String getCreate_date() {
//            return create_date;
//        }
//
//        public void setCreate_date(String create_date) {
//            this.create_date = create_date;
//        }
//
//        public int getPage_count() {
//            return page_count;
//        }
//
//        public void setPage_count(int page_count) {
//            this.page_count = page_count;
//        }
//
//        public int getWidth() {
//            return width;
//        }
//
//        public void setWidth(int width) {
//            this.width = width;
//        }
//
//        public int getHeight() {
//            return height;
//        }
//
//        public void setHeight(int height) {
//            this.height = height;
//        }
//
//        public int getSanity_level() {
//            return sanity_level;
//        }
//
//        public void setSanity_level(int sanity_level) {
//            this.sanity_level = sanity_level;
//        }
//
//        public MetaSinglePageBean getMeta_single_page() {
//            return meta_single_page;
//        }
//
//        public void setMeta_single_page(MetaSinglePageBean meta_single_page) {
//            this.meta_single_page = meta_single_page;
//        }
//
//        public int getTotal_view() {
//            return total_view;
//        }
//
//        public void setTotal_view(int total_view) {
//            this.total_view = total_view;
//        }
//
//        public int getTotal_bookmarks() {
//            return total_bookmarks;
//        }
//
//        public void setTotal_bookmarks(int total_bookmarks) {
//            this.total_bookmarks = total_bookmarks;
//        }
//
//        public boolean isIs_bookmarked() {
//            return is_bookmarked;
//        }
//
//        public void setIs_bookmarked(boolean is_bookmarked) {
//            this.is_bookmarked = is_bookmarked;
//        }
//
//        public boolean isVisible() {
//            return visible;
//        }
//
//        public void setVisible(boolean visible) {
//            this.visible = visible;
//        }
//
//        public List<TagsBean> getTags() {
//            return tags;
//        }
//
//        public void setTags(List<TagsBean> tags) {
//            this.tags = tags;
//        }
//
//        public List<String> getTools() {
//            return tools;
//        }
//
//        public void setTools(List<String> tools) {
//            this.tools = tools;
//        }
//
//        public List<MetaPagesBean> getMeta_pages() {
//            return meta_pages;
//        }
//
//        public void setMeta_pages(List<MetaPagesBean> meta_pages) {
//            this.meta_pages = meta_pages;
//        }
//
//        public static class ImageUrlsBean {
//            /**
//             * square_medium : https://i.pximg.net/c/360x360_70/img-master/img/2016/07/11/22/48/19/57860709_p0_square1200.jpg
//             * medium : https://i.pximg.net/c/540x540_70/img-master/img/2016/07/11/22/48/19/57860709_p0_master1200.jpg
//             * large : https://i.pximg.net/c/600x1200_90/img-master/img/2016/07/11/22/48/19/57860709_p0_master1200.jpg
//             */
//
//            private String square_medium;
//            private String medium;
//            private String large;
//
//            public String getSquare_medium() {
//                return square_medium;
//            }
//
//            public void setSquare_medium(String square_medium) {
//                this.square_medium = square_medium;
//            }
//
//            public String getMedium() {
//                return medium;
//            }
//
//            public void setMedium(String medium) {
//                this.medium = medium;
//            }
//
//            public String getLarge() {
//                return large;
//            }
//
//            public void setLarge(String large) {
//                this.large = large;
//            }
//        }
//
//        public static class UserBean {
//            public static class ProfileImageUrlsBean {
//            }
//        }
//
//        public static class MetaSinglePageBean {
//        }
//
//        public static class TagsBean {
//            /**
//             * name : R-18
//             */
//
//            private String name;
//
//            public String getName() {
//                return name;
//            }
//
//            public void setName(String name) {
//                this.name = name;
//            }
//        }
//
//        public static class MetaPagesBean {
//            /**
//             * image_urls : {"square_medium":"https://i.pximg.net/c/360x360_70/img-master/img/2016/07/11/22/48/19/57860709_p0_square1200.jpg","medium":"https://i.pximg.net/c/540x540_70/img-master/img/2016/07/11/22/48/19/57860709_p0_master1200.jpg","large":"https://i.pximg.net/c/600x1200_90/img-master/img/2016/07/11/22/48/19/57860709_p0_master1200.jpg","original":"https://i2.pixiv.net/img-original/img/2016/07/11/22/48/19/57860709_p0.jpg"}
//             */
//
//            private ImageUrlsBeanX image_urls;
//
//            public ImageUrlsBeanX getImage_urls() {
//                return image_urls;
//            }
//
//            public void setImage_urls(ImageUrlsBeanX image_urls) {
//                this.image_urls = image_urls;
//            }
//
//            public static class ImageUrlsBeanX {
//                /**
//                 * square_medium : https://i.pximg.net/c/360x360_70/img-master/img/2016/07/11/22/48/19/57860709_p0_square1200.jpg
//                 * medium : https://i.pximg.net/c/540x540_70/img-master/img/2016/07/11/22/48/19/57860709_p0_master1200.jpg
//                 * large : https://i.pximg.net/c/600x1200_90/img-master/img/2016/07/11/22/48/19/57860709_p0_master1200.jpg
//                 * original : https://i2.pixiv.net/img-original/img/2016/07/11/22/48/19/57860709_p0.jpg
//                 */
//
//                private String square_medium;
//                private String medium;
//                private String large;
//                private String original;
//
//                public String getSquare_medium() {
//                    return square_medium;
//                }
//
//                public void setSquare_medium(String square_medium) {
//                    this.square_medium = square_medium;
//                }
//
//                public String getMedium() {
//                    return medium;
//                }
//
//                public void setMedium(String medium) {
//                    this.medium = medium;
//                }
//
//                public String getLarge() {
//                    return large;
//                }
//
//                public void setLarge(String large) {
//                    this.large = large;
//                }
//
//                public String getOriginal() {
//                    return original;
//                }
//
//                public void setOriginal(String original) {
//                    this.original = original;
//                }
//            }
//        }
//    }
}
