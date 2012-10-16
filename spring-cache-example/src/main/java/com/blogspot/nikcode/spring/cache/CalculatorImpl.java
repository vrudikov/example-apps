/***********************************************************************************
*
* Copyright 2011 - 2012 Yota Lab LLC, Russia
* Copyright 2011 - 2012 Seconca Holdings Limited, Cyprus
*
*  This source code is Yota Lab Confidential Proprietary
*  This software is protected by copyright.  All rights and titles are reserved.
*  You shall not use, copy, distribute, modify, decompile, disassemble or reverse
*  engineer the software. Otherwise this violation would be treated by law and
*  would be subject to legal prosecution.  Legal use of the software provides
*  receipt of a license from the right holder only.
*
*
************************************************************************************/

package com.blogspot.nikcode.spring.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service("calculator")
public class CalculatorImpl implements Calculator {

    @Cacheable("default")
    @Override
    public int longOperation(int x1) {
        System.out.println("compute");
        return x1;
    }
}
