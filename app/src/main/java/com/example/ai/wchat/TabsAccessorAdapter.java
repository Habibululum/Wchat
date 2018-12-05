package com.example.ai.wchat;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsAccessorAdapter extends FragmentPagerAdapter {

    public TabsAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    //setting fragment item
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;
            case 1:
                GroupsFragment groupsFragment = new GroupsFragment();
                return groupsFragment;
            case 2:
                ContactsFragment contactsFragment = new ContactsFragment();
                return contactsFragment;

            default:
                return null;
        }
    }


    @Override
    //set many fragment is in use
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    //set name for fragment item
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Chars";
            case 1:
                return "Groups";
            case 2:
                return "Contacts";

            default:
                return null;
        }
    }
}
