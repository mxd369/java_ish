package lesson7arraylistandarrays;

import java.util.ArrayList;

public class arraylist
{
    ArrayList<Picture> gallery = new ArrayList<Picture>();
    gallery.add(new Picture("1.jpg"));
    gallery.add(new Picture("2.jpg"));
    gallery.add(new Picture("3.jpg"));
    gallery.add(new Picture("4.jpg"));
    gallery.add(new Picture("5.jpg"));
    
    Picture first = gallery.get(0);
    int lastIndex = gallery.size() - 1;
    Picture last = gallery.get(lastIndex);
    
    // for very valid index
    // 0, 1, 2, ..., size() -1
    for (int i = 0; i < gallery.size();i++)
    {
        Picture pic = gallery.get(i);
        pic.draw();
        // (0,0)
        // move to (100*i, 0)
        // getMaxX() + 10
        
    }
}