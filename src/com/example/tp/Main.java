package com.example.tp;

public class Main {
    public static void main(String[] args) {
        System.out.println("TEST");

        FileSystem fs = new FileSystem();
        FileItem f1 = new FileItem("doc.txt", 1200);
        FileItem f2 = new FileItem("image.png", 4500);
        FileItem f3 = new FileItem("notes.pdf", 800);

        Directory home = new Directory("origine");
        home.add(f1);
        home.add(f2);

        Directory docs = new Directory("docs");
        docs.add(f3);
        home.add(docs);

        fs.addRoot(home);
        fs.addRoot(new FileItem("readme.md", 300));

        fs.listAll();
        System.out.println("Taille totale : " + fs.totalSize() + " B");
    }
}