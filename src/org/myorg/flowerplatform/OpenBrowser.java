/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.flowerplatform;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.awt.HtmlBrowser;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Edit",
        id = "org.myorg.flowerplatform.OpenBrowser")
@ActionRegistration(
        iconBase = "org/myorg/flowerplatform/flower_by_evilbeckuh.gif",
        displayName = "#CTL_OpenBrowser")
@ActionReference(path = "Toolbars/File", position = 300)
@Messages("CTL_OpenBrowser=Flower Platform")
public final class OpenBrowser implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            HtmlBrowser.URLDisplayer.getDefault().
                    showURL(new URL("http://flower-platform.org"));
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
