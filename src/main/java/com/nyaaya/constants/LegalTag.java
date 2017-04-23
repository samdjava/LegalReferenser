package com.nyaaya.constants;

/**
 * Created by root on 23/4/17.
 */
public enum  LegalTag {
    NO_JAIL("No Jail","No Jail time","No Prison","Prison Time is 0");

    String [] alternativeTags;

    LegalTag (String... alternativeTag){
        this.alternativeTags = alternativeTag;
    }

    LegalTag getLegalTags(String tag) {
        for(LegalTag legalTag:LegalTag.values()){
            if(legalTag.name().equals(tag)){
                return legalTag;
            }
        }
        return null;
    }

    String [] getAlternativeTags(){
        return alternativeTags;
    }

}
