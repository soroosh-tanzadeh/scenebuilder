/*
 * Copyright (c) 2016, Gluon and/or its affiliates.
 * Copyright (c) 2012, 2014, Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.oracle.javafx.scenebuilder.kit.editor;

import com.gluonhq.charm.glisten.visual.GlistenStyleClasses;
import com.oracle.javafx.scenebuilder.app.i18n.I18N;
import com.oracle.javafx.scenebuilder.kit.util.Deprecation;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javafx.scene.input.MouseEvent;

/**
 * This class contains static methods that depends on the platform.
 *
 * @treatAsPrivate
 */
public class EditorPlatform {

    private static final String osName = System.getProperty("os.name").toLowerCase(Locale.ROOT); //NOI18N

    /**
     * True if current platform is running Linux.
     */
    public static final boolean IS_LINUX = osName.contains("linux"); //NOI18N

    /**
     * True if current platform is running Mac OS X.
     */
    public static final boolean IS_MAC = osName.contains("mac"); //NOI18N

    /**
     * True if current platform is running Windows.
     */
    public static final boolean IS_WINDOWS = osName.contains("windows"); //NOI18N

    /**
     * Charm Glisten version
     */
    public static final String GLUON_CHARM_GLISTEN_VERSION = "4.2.0";

    /**
     * Gluon Glisten package
     */
    public static final String GLUON_PACKAGE = "com.gluonhq.charm.glisten";

    /**
     * This URL is where you go when the user takes Scene Builder Help action (shortcut F1)
     */
    public static final String DOCUMENTATION_URL = "https://docs.oracle.com/javafx/index.html"; //NOI18N

    /**
     * Javadoc home (for Inspector and CSS Analyzer properties)
     */
    public final static String JAVADOC_HOME = "https://docs.oracle.com/javase/8/javafx/api/"; //NOI18N

    /**
     * Gluon javadoc home (for Inspector and CSS Analyzer properties)
     */
    public final static String GLUON_JAVADOC_HOME = "http://docs.gluonhq.com/charm/javadoc/" + GLUON_CHARM_GLISTEN_VERSION +"/"; //NOI18N

    /**
     * Themes supported by Scene Builder Kit.
     */
    public enum Theme {
        GLUON_MOBILE {
            @Override
            public String toString() {
                return I18N.getString("title.theme.gluonmobile");
            }
        },
        MODENA{
            @Override
            public String toString() {
                return I18N.getString("title.theme.modena");
            }
        },
        MODENA_TOUCH{
            @Override
            public String toString() {
                return I18N.getString("title.theme.modena.touch");
            }
        },
        MODENA_HIGH_CONTRAST_BLACK_ON_WHITE{
            @Override
            public String toString() {
                return I18N.getString("title.theme.modena.high.contrast.blackonwhite");
            }
        },
        MODENA_HIGH_CONTRAST_WHITE_ON_BLACK{
            @Override
            public String toString() {
                return I18N.getString("title.theme.modena.high.contrast.whiteonblack");
            }
        },
        MODENA_HIGH_CONTRAST_YELLOW_ON_BLACK{
            @Override
            public String toString() {
                return I18N.getString("title.theme.modena.high.contrast.yellowonblack");
            }
        },
        MODENA_TOUCH_HIGH_CONTRAST_BLACK_ON_WHITE{
            @Override
            public String toString() {
                return I18N.getString("title.theme.modena.touch.high.contract.blackonwhite");
            }
        },
        MODENA_TOUCH_HIGH_CONTRAST_WHITE_ON_BLACK{
            @Override
            public String toString() {
                return I18N.getString("title.theme.modena.touch.high.contrast.whiteonblack");
            }
        },
        MODENA_TOUCH_HIGH_CONTRAST_YELLOW_ON_BLACK{
            @Override
            public String toString() {
                return I18N.getString("title.theme.modena.touch.high.contrast.yellowonblack");
            }
        },
        CASPIAN{
            @Override
            public String toString() {
                return I18N.getString("title.theme.caspian");
            }
        },
        CASPIAN_HIGH_CONTRAST{
            @Override
            public String toString() {
                return I18N.getString("title.theme.caspian.high.contrast");
            }
        },
        CASPIAN_EMBEDDED{
            @Override
            public String toString() {
                return I18N.getString("title.theme.caspian.embedded");
            }
        },
        CASPIAN_EMBEDDED_HIGH_CONTRAST{
            @Override
            public String toString() {
                return I18N.getString("title.theme.caspian.embedded.high.contrast");
            }
        },
        CASPIAN_EMBEDDED_QVGA{
            @Override
            public String toString() {
                return I18N.getString("title.theme.caspian.embedded.qvga");
            }
        },
        CASPIAN_EMBEDDED_QVGA_HIGH_CONTRAST{
            @Override
            public String toString() {
                return I18N.getString("title.theme.caspian.embedded.qvga.high.contrast");
            }
        }
    }

    /**
     * Gluon Swatch
     */
    public enum GluonSwatch {
        BLUE{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.blue");
            }
        },
        CYAN{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.cyan");
            }
        },
        DEEP_ORANGE{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.deeporange");
            }
        },
        DEEP_PURPLE{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.deeppurple");
            }
        },
        GREEN{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.green");
            }
        },
        INDIGO{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.indigo");
            }
        },
        LIGHT_BLUE{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.lightblue");
            }
        },
        PINK{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.pink");
            }
        },
        PURPLE{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.purple");
            }
        },
        RED{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.red");
            }
        },
        TEAL{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.teal");
            }
        },
        LIGHT_GREEN{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.lightgreen");
            }
        },
        LIME{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.lime");
            }
        },
        YELLOW{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.yellow");
            }
        },
        AMBER{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.amber");
            }
        },
        ORANGE{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.orange");
            }
        },
        BROWN{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.brown");
            }
        },
        GREY{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.grey");
            }
        },
        BLUE_GREY{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.swatch.bluegrey");
            }
        };
    }

    /**
     * Gluon Theme
     */
    public enum GluonTheme {
        LIGHT{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.theme.light");
            }
        },
        DARK{
            @Override
            public String toString() {
                return I18N.getString("title.gluon.theme.dark");
            }
        };
    }

    /**
     * Returns the url string for locating the specified stylesheet.
     * SB uses a set of CSS files aggregating several @import statements (see DTL-6799).
     *
     * @param theme theme for which string should be computed
     * @return string for locating the specified stylesheet.
     */
    public static String getThemeStylesheetURL(Theme theme) {
        final String result;

        switch (theme) {
            default:
                result = null;
                break;
            case GLUON_MOBILE:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_STYLESHEET);
                break;
            case MODENA:
                result = Deprecation.MODENA_STYLESHEET;
                break;
            case MODENA_TOUCH:
                result = Deprecation.MODENA_TOUCH_STYLESHEET;
                break;
            case MODENA_HIGH_CONTRAST_BLACK_ON_WHITE:
                result = Deprecation.MODENA_HIGHCONTRAST_BLACKONWHITE_STYLESHEET;
                break;
            case MODENA_HIGH_CONTRAST_WHITE_ON_BLACK:
                result = Deprecation.MODENA_HIGHCONTRAST_WHITEONBLACK_STYLESHEET;
                break;
            case MODENA_HIGH_CONTRAST_YELLOW_ON_BLACK:
                result = Deprecation.MODENA_HIGHCONTRAST_YELLOWONBLACK_STYLESHEET;
                break;
            case MODENA_TOUCH_HIGH_CONTRAST_BLACK_ON_WHITE:
                result = Deprecation.MODENA_TOUCH_HIGHCONTRAST_BLACKONWHITE_STYLESHEET;
                break;
            case MODENA_TOUCH_HIGH_CONTRAST_WHITE_ON_BLACK:
                result = Deprecation.MODENA_TOUCH_HIGHCONTRAST_WHITEONBLACK_STYLESHEET;
                break;
            case MODENA_TOUCH_HIGH_CONTRAST_YELLOW_ON_BLACK:
                result = Deprecation.MODENA_TOUCH_HIGHCONTRAST_YELLOWONBLACK_STYLESHEET;
                break;
            case CASPIAN:
                result = Deprecation.CASPIAN_STYLESHEET;
                break;
            case CASPIAN_HIGH_CONTRAST:
                result = Deprecation.CASPIAN_HIGHCONTRAST_STYLESHEET;
                break;
            case CASPIAN_EMBEDDED:
                result = Deprecation.CASPIAN_EMBEDDED_STYLESHEET;
                break;
            case CASPIAN_EMBEDDED_HIGH_CONTRAST:
                result = Deprecation.CASPIAN_EMBEDDED_HIGHCONTRAST_STYLESHEET;
                break;
            case CASPIAN_EMBEDDED_QVGA:
                result = Deprecation.CASPIAN_EMBEDDED_QVGA_STYLESHEET;
                break;
            case CASPIAN_EMBEDDED_QVGA_HIGH_CONTRAST:
                result = Deprecation.CASPIAN_EMBEDDED_QVGA_HIGHCONTRAST_STYLESHEET;
                break;
        }
        
        if (!theme.equals(Theme.MODENA)) {
            assert result != null : "Missing logic for " + theme;
        }

        return result;
    }

    public static String getGluonThemeStylesheetURL(GluonTheme theme) {
        String result;
        switch (theme) {
            case DARK:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_DARK_THEME);
                break;
            case LIGHT:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_LIGHT_THEME);
                break;
            default:
                result = null;
                break;
        }
        return result;
    }

    public static String getGluonSwatchStylesheetURL(GluonSwatch swatch) {
        String result;
        switch(swatch) {
            case BLUE:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_BLUE_SWATCH);
                break;
            case CYAN:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_CYAN_SWATCH);
                break;
            case DEEP_ORANGE:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_DEEP_ORANGE_SWATCH);
                break;
            case DEEP_PURPLE:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_DEEP_PURPLE_SWATCH);
                break;
            case GREEN:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_GREEN_SWATCH);
                break;
            case INDIGO:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_INDIGO_SWATCH);
                break;
            case LIGHT_BLUE:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_LIGHT_BLUE_SWATCH);
                break;
            case PINK:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_PINK_SWATCH);
                break;
            case PURPLE:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_PURPLE_SWATCH);
                break;
            case RED:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_RED_SWATCH);
                break;
            case TEAL:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_TEAL_SWATCH);
                break;
            case LIGHT_GREEN:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_LIGHT_GREEN_SWATCH);
                break;
            case LIME:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_LIME_SWATCH);
                break;
            case YELLOW:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_YELLOW_SWATCH);
                break;
            case AMBER:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_AMBER_SWATCH);
                break;
            case ORANGE:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_ORANGE_SWATCH);
                break;
            case BROWN:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_BROWN_SWATCH);
                break;
            case GREY:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_GREY_SWATCH);
                break;
            case BLUE_GREY:
                result = GlistenStyleClasses.impl_loadResource(Deprecation.GLUON_BLUE_GREY_SWATCH);
                break;
            default:
                result = null;
                break;
        }
        return result;
    }
    
    public static String getPlatformThemeStylesheetURL() {
        // Return USER_AGENT css, which is Modena for fx 8.0
        return Deprecation.MODENA_STYLESHEET;
    }

    public static String getGluonDocumentStylesheetURL() {
        return Deprecation.GLUON_DOCUMENT_STYLESHEET;
    }

    public static boolean isModena(Theme theme) {
        return theme.toString().startsWith("MODENA");
    }
    
    public static boolean isModenaBlackonwhite(Theme theme) {
        return isModena(theme)
                && theme.toString().contains("BLACK_ON_WHITE");
    }
    
    public static boolean isModenaWhiteonblack(Theme theme) {
        return isModena(theme)
                && theme.toString().contains("WHITE_ON_BLACK");
    }
    
    public static boolean isModenaYellowonblack(Theme theme) {
        return isModena(theme)
                && theme.toString().contains("YELLOW_ON_BLACK");
    }
    
    public static boolean isModenaHighContrast(Theme theme) {
        return isModena(theme)
                && theme.toString().contains("HIGH_CONTRAST");
    }
    
    public static boolean isModenaTouch(Theme theme) {
        return isModena(theme)
                && theme.toString().contains("TOUCH");
    }
    
    public static boolean isModenaTouchHighContrast(Theme theme) {
        return isModena(theme)
                && theme.toString().contains("HIGH_CONTRAST")
                && theme.toString().contains("TOUCH");
    }
    
    public static boolean isCaspian(Theme theme) {
        return theme.toString().startsWith("CASPIAN");
    }

    public static boolean isGluonMobile(Theme theme) {
        return theme.toString().startsWith("GLUON_MOBILE");
    }

    /**
     * Requests the underlying platform to open a given file. On Linux, it runs
     * 'xdg-open'. On Mac, it runs 'open'. On Windows, it runs 'cmd /c start'.
     *
     * @param path path for the file to be opened
     * @throws IOException if an error occurs
     */
    public static void open(String path) throws IOException {
        List<String> args = new ArrayList<>();
        if (EditorPlatform.IS_MAC) {
            args.add("open"); //NOI18N
            args.add(path);
        } else if (EditorPlatform.IS_WINDOWS) {
            args.add("cmd"); //NOI18N
            args.add("/c"); //NOI18N
            args.add("start"); //NOI18N

            if (path.contains(" ")) { //NOI18N
                args.add("\"html\""); //NOI18N
            }

            args.add(path);
        } else if (EditorPlatform.IS_LINUX) {
            // xdg-open does fine on Ubuntu, which is a Debian.
            // I've no idea how it does with other Linux flavors.
            args.add("xdg-open"); //NOI18N
            args.add(path);
        }

        if (!args.isEmpty()) {
            executeDaemon(args, null);
        }
    }

    /**
     * Requests the underlying platform to "reveal" the specified folder. On
     * Linux, it runs 'nautilus'. On Mac, it runs 'open'. On Windows, it runs
     * 'explorer /select'.
     *
     * @param filePath path for the folder to be revealed
     * @throws IOException if an error occurs
     */
    public static void revealInFileBrowser(File filePath) throws IOException {
        List<String> args = new ArrayList<>();
        String path = filePath.toURI().toURL().toExternalForm();
        if (EditorPlatform.IS_MAC) {
            args.add("open"); //NOI18N
            args.add("-R"); //NOI18N
            args.add(path);
        } else if (EditorPlatform.IS_WINDOWS) {
            args.add("explorer"); //NOI18N
            args.add("/select," + path); //NOI18N
        } else if (EditorPlatform.IS_LINUX) {
            // nautilus does fine on Ubuntu, which is a Debian.
            // I've no idea how it does with other Linux flavors.
            args.add("nautilus"); //NOI18N
            // The nautilus that comes with Ubuntu up to 11.04 included doesn't
            // take a file path as parameter (you get an error popup), you must
            // provide a dir path.
            // Starting with Ubuntu 11.10 (the first based on kernel 3.x) a
            // file path is well managed.
            int osVersionNumerical = Integer.parseInt(System.getProperty("os.version").substring(0, 1)); //NOI18N
            if (osVersionNumerical < 3) {
                // Case Ubuntu 10.04 to 11.04: What you provide to nautilus is
                // the name of the directory containing the file you want to see
                // listed. See DTL-5384.
                path = filePath.getAbsoluteFile().getParent();
                if (path == null) {
                    path = "."; //NOI18N
                }
            }
            args.add(path);
        } else {
            // Not Supported
        }

        if (!args.isEmpty()) {
            executeDaemon(args, null);
        }
    }

    /**
     * Returns true if the modifier key for continuous selection is down.
     *
     * @param e mouse event to check (never null)
     * @return true if the modifier key for continuous selection is down.
     */
    public static boolean isContinuousSelectKeyDown(MouseEvent e) {
        return e.isShiftDown();
    }

    /**
     * Returns true if the modifier key for non-continuous selection is down.
     *
     * @param e mouse event to check (never null).
     * @return true if the modifier key for non-continuous selection is down.
     */
    public static boolean isNonContinousSelectKeyDown(MouseEvent e) {
        return IS_MAC ? e.isMetaDown(): e.isControlDown();
    }

    /**
     * Returns true if the jvm is running with assertions enabled.
     *
     * @return true if the jvm is running with assertions enabled.
     */
    public static boolean isAssertionEnabled() {
        return EditorPlatform.class.desiredAssertionStatus();
    }

    /*
     * Private
     */
    private static void executeDaemon(List<String> cmd, File wDir) throws IOException {
        try {
            ProcessBuilder builder = new ProcessBuilder(cmd);
            builder = builder.directory(wDir);
            builder.start();
        } catch (RuntimeException ex) {
            throw new IOException(ex);
        }
    }

}
