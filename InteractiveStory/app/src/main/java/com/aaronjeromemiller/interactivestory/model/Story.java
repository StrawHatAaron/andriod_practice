package com.aaronjeromemiller.interactivestory.model;

import android.util.Log;

import com.aaronjeromemiller.interactivestory.R;
import com.aaronjeromemiller.interactivestory.ui.StoryActivity;

/**
 * Created by aaronmiller on 7/19/17.
 */

public class Story {
    public static final String TAG = Story.class.getSimpleName();

    private Page[] pages;

    public Story(){
        pages = new Page[7];
        pages[0] = new Page(R.drawable.page0,
                R.string.page0,
                new Choice(R.string.page0_choice1, 1),
                new Choice(R.string.page1_choice2, 2));

        pages[1] = new Page(R.drawable.page1,
                R.string.page1,
                new Choice(R.string.page1_choice1, 3),
                new Choice(R.string.page1_choice2, 4));

        pages[2] = new Page(R.drawable.page2,
                R.string.page2,
                new Choice(R.string.page2_choice1, 4),
                new Choice(R.string.page2_choice2, 6));

        pages[3] = new Page(R.drawable.page3,
                R.string.page3,
                new Choice(R.string.page3_choice1, 4),
                new Choice(R.string.page3_choice2, 5));

        pages[4] = new Page(R.drawable.page4,
                R.string.page4,
                new Choice(R.string.page4_choice1, 5),
                new Choice(R.string.page4_choice2, 6));

        pages[5] = new Page(R.drawable.page5, R.string.page5);

        pages[6] = new Page(R.drawable.page6, R.string.page6);
    }

    public Page getPage(int pageNumber) {

        if(pageNumber >= pages.length){
            pageNumber = 0;
        }
        return pages[pageNumber];
    }
}
