package com.edusoho.kuozhi.imserver.command;

import org.json.JSONObject;

/**
 * Created by su on 2016/3/18.
 */
public interface ICommand {

    public void invoke(JSONObject params);
}
