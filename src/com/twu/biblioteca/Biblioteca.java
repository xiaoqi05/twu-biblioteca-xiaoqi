package com.twu.biblioteca;

class Biblioteca {


    void showWelcomeMessage() {
        consolePrint("welcome to Biblioteca");
    }

    private void consolePrint(String printContent) {
        System.out.println(printContent);
    }

    //book author:xiaoqi publishDate:2014-5 bookName:times ISBN: 92432309409
    /*
    * 作者: Higashino Keigo
出版社: 南海出版公司
原作名: ナミヤ雑貨店の奇蹟
译者: 李盈春
出版年: 2014-5
页数: 291
定价: 39.50元
装帧: Hardcover
丛书: 新经典文库·东野圭吾作品
ISBN: 9787544270878
    * */
    void showAllLibraryBooks() {
        consolePrint("bookName:times author:xiaoqi publishDate:2014-5");
    }
}
