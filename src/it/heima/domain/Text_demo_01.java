package it.heima.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by GuanShiPeng on 2017/7/26 16:38.
 */
public class Text_demo_01
{
    private String[] strings;
    private List list;
    private Map map;
    private Properties properties;

    public String[] getStrings()
    {
        return strings;
    }

    public void setStrings(String[] strings)
    {
        this.strings = strings;
    }

    public List getList()
    {
        return list;
    }

    public void setList(List list)
    {
        this.list = list;
    }

    public Map getMap()
    {
        return map;
    }

    public void setMap(Map map)
    {
        this.map = map;
    }

    public Properties getProperties()
    {
        return properties;
    }

    public void setProperties(Properties properties)
    {
        this.properties = properties;
    }

    @Override
    public String toString()
    {
        return "Text_demo_01{" +
                "strings=" + Arrays.toString(strings) +
                ", list=" + list +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
