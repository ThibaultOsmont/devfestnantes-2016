package com.nilhcem.devfestnantes.ui.settings;

public interface SettingsMvp {

    interface View {
        void setNotifySessionsCheckbox(boolean checked);

        void setAppVersion(CharSequence version);
    }

    interface Presenter {
        void onCreate();

        boolean onNotifySessionsChange(boolean checked);
    }
}
