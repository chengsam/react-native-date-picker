package com.henninghall.date_picker.props;

import com.facebook.react.bridge.Dynamic;
import com.henninghall.date_picker.models.YearTextAlign;

public class YearTextAlignProp extends Prop<YearTextAlign> {
    public static final String name = "yearTextAlign";

    @Override
    public YearTextAlign toValue(Dynamic value){
        return YearTextAlign.valueOf(value.asString());
    }
}
