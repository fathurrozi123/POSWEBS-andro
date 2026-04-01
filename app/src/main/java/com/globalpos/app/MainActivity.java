package com.globalpos.app;

import com.getcapacitor.BridgeActivity;
import android.os.Bundle;
import com.getcapacitor.Plugin;
import com.getcapacitor.Bridge;

public class MainActivity extends BridgeActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Load external URL instead of local assets
        Bridge bridge = this.getBridge();
        if (bridge != null) {
            bridge.setServerUrl("https://globalpos.my.id");
        }
    }
}
