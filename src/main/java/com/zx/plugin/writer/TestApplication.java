package com.zx.plugin.writer;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

/**
 * author:ZhengXing
 * datetime:2020-01-30 19:58
 */
public class TestApplication extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Messages.showDialog("Hello World", "Hello", new String[]{"y", "n"}, 0, Messages.getInformationIcon());
    }
}
