package com.office.pc25245.revertstring;
/*有趣的面试题：字符串不允许用splite方法，将一个字符串的单词倒序*/
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String s="I Love You My Dear My Dalling";
    private List<String> tempStringer=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        revertString(s);

    }
    private String revertString(String sourceString){
        char tempString[] = sourceString.toCharArray();int p=0;boolean isStart=true;int tempIndex =0;
        for(int i=0;i<tempString.length;i++){
           if(tempString[i] == ' '){
               if(isStart){
                   tempStringer.add(sourceString.substring(0,i));
                   tempIndex=i;
                   isStart=false;
               }else{
                   tempStringer.add(sourceString.substring(tempIndex+1,i));
                   tempIndex=i;
               }
               p++;
           }else {
               if(i == (tempString.length-1)){
                   tempStringer.add(sourceString.substring(tempIndex+1,tempString.length));
                   break;
               }
           }
        }
        sourceString="";
        for(int j=tempStringer.size()-1;j>=0;j--){
            sourceString +=tempStringer.get(j)+" ";
        }
        Log.d("zhangrui","sourceString = "+sourceString);
        return sourceString;
    }

}
