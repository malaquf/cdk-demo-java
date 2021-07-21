package com.myorg;

import software.amazon.awscdk.core.App;

public final class CdkDemoJavaApp {
    public static void main(final String[] args) {
        App app = new App();

        new CdkDemoJavaStack(app, "CdkDemoJavaStack");

        app.synth();
    }
}
