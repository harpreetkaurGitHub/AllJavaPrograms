package com.company.exceptionHandling.CustomExceptions;

public class LoveYouException extends RuntimeException
{
    public LoveYouException(String msg){
        super(msg);
    }
}
