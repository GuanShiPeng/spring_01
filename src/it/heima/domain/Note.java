package it.heima.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by GuanShiPeng on 2017/7/28 15:16.
 */
//可以不加名字，按类名查找，首个字母小写
@Component
public class Note
{
    @Value("001")
    private String note_id;
    @Value("小强")
    private String note_name;

    public String getNote_id()
    {
        return note_id;
    }

    public void setNote_id(String note_id)
    {
        this.note_id = note_id;
    }

    @Override
    public String toString()
    {
        return "Note{" +
                "note_id='" + note_id + '\'' +
                ", note_name='" + note_name + '\'' +
                '}';
    }
}
