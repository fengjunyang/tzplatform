package com.topcheer.model;

import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;
/**
 * Created by feng on 2018/3/6.
 */
public class BaseModel implements Serializable{
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
