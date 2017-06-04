package com.shua1.common.util;

import java.math.BigDecimal;
import java.util.Date;

public class DBUtil
{
  public static Integer getInt(Object obj, Integer defalut)
  {
    if (obj == null) {
      return defalut;
    }
    Integer result = null;
    if ((obj instanceof Integer)) {
      result = (Integer)obj;
    }
    return result;
  }
  
  public static Double getDouble(Object obj, Double defalut)
  {
    if (obj == null) {
      return defalut;
    }
    Double result = null;
    if ((obj instanceof Double))
    {
      result = (Double)obj;
    }
    else if ((obj instanceof Integer))
    {
      Integer i = (Integer)obj;
      result = Double.valueOf(i.doubleValue());
    }
    else if ((obj instanceof BigDecimal))
    {
      BigDecimal b = (BigDecimal)obj;
      result = Double.valueOf(b.doubleValue());
    }
    return result;
  }
  
  public static Date getDate(Object obj, Date defualtVal)
  {
    if (obj == null) {
      return defualtVal;
    }
    Date result = null;
    if ((obj instanceof Date))
    {
      result = (Date)obj;
      return result;
    }
    return result;
  }
  
  public static String getString(Object obj, String defualtVal)
  {
    if (obj == null) {
      return defualtVal;
    }
    String result = null;
    if ((obj instanceof String))
    {
      result = (String)obj;
      return result;
    }
    return result;
  }
  
  public static Long getLong(Object obj, Long defualtVal)
  {
    if (obj == null) {
      return defualtVal;
    }
    Long result = null;
    if ((obj instanceof Long))
    {
      result = (Long)obj;
      return result;
    }
    if ((obj instanceof String))
    {
      String str = (String)obj;
      try
      {
        return Long.valueOf(str);
      }
      catch (Exception e)
      {
        e.printStackTrace();
        return defualtVal;
      }
    }
    return result;
  }
  
  public static Float getFloat(Object obj, Float defualtVal)
  {
    if (obj == null) {
      return defualtVal;
    }
    Float result = null;
    if ((obj instanceof Float))
    {
      result = (Float)obj;
      return result;
    }
    if ((obj instanceof String))
    {
      String str = (String)obj;
      try
      {
        return Float.valueOf(str);
      }
      catch (Exception e)
      {
        e.printStackTrace();
        return defualtVal;
      }
    }
    return result;
  }
  
  public static BigDecimal getBigDecimal(Object obj, BigDecimal defualtVal)
  {
    if (obj == null) {
      return defualtVal;
    }
    BigDecimal result = null;
    if ((obj instanceof BigDecimal))
    {
      result = (BigDecimal)obj;
      return result;
    }
    if ((obj instanceof String))
    {
      String str = (String)obj;
      try
      {
        return new BigDecimal(str);
      }
      catch (Exception e)
      {
        e.printStackTrace();
        return defualtVal;
      }
    }
    return result;
  }
  
  public static Date getDate(Object obj)
  {
    return getDate(obj, null);
  }
  
  public static String getString(Object obj)
  {
    return getString(obj, null);
  }
  
  public static Double getDouble(Object obj)
  {
    return getDouble(obj, null);
  }
  
  public static Integer getInt(Object obj)
  {
    return getInt(obj, null);
  }
  
  public static Float getFloat(Object obj)
  {
    return getFloat(obj, null);
  }
  
  public static BigDecimal getBigDecimal(Object obj)
  {
    return getBigDecimal(obj, null);
  }
  
  public static Long getLong(Object obj)
  {
    return getLong(obj, null);
  }
}
