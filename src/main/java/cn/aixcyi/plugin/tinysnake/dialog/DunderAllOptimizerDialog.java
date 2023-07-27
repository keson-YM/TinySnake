package cn.aixcyi.plugin.tinysnake.dialog;

import cn.aixcyi.plugin.tinysnake.SymbolsOrder;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class DunderAllOptimizerDialog extends DialogWrapper {
    private JPanel contentPanel;
    private JRadioButton radioAlphabetOrder;
    private JRadioButton radioCharOrder;
    private JRadioButton radioFullingRow;

    public DunderAllOptimizerDialog() {
        super(true);
        setResizable(false);
        setTitle("优化 __all__");
        init();
    }

    public SymbolsOrder getOrdering() {
        if (radioCharOrder.isSelected())
            return SymbolsOrder.CHARSET;
        else if (radioAlphabetOrder.isSelected())
            return SymbolsOrder.ALPHABET;
        else
            return SymbolsOrder.APPEARANCE;
    }

    public boolean isFillingRow() {
        return radioFullingRow.isSelected();
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        JPanel dialogPanel = new JPanel(new BorderLayout());
        dialogPanel.add(contentPanel, BorderLayout.CENTER);
        return dialogPanel;
    }
}