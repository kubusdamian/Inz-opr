package Inzynieria;
//
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Inzyn {
    private JPanel Costam;
    private JTree DrzewoLodz;
    private JTable tabelaGlowna;
    private JScrollPane TabelaScroll;
   // private JTextPane textPane1;
    private JLabel Wiadomosci;
    private JList list1;
    private JScrollPane ScrollPanelList;
    private JButton stonaGłównaButton;
    private JButton tabelaButton;
    private JButton dodajLokalButton;
    private JButton usuńLokalButton;
    private JTextField Ulica;
    private JTextField NrDomu;
    private JTextField NrMieszkania;
    private JTextField KodPocztowy;
    private JTextField Stan;
    private JTextField Typ;
    private JTextField Miasto;
    private JButton dodajButton;
    private JPanel DodawanieLokalu;


    public Inzyn() {


        //create the root node
        DefaultTreeModel model = (DefaultTreeModel) DrzewoLodz.getModel();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Lokale");
        //create the child nodes
        DefaultMutableTreeNode Lodz = new DefaultMutableTreeNode("Łódź");


        DefaultMutableTreeNode Mieszkalne1 = new DefaultMutableTreeNode("Mieszkalne");
        Lodz.add(Mieszkalne1);
        DefaultMutableTreeNode Wynajete1 = new DefaultMutableTreeNode("Wynajete");
        Mieszkalne1.add(Wynajete1);
        DefaultMutableTreeNode Wolnel = new DefaultMutableTreeNode("Wolne");
        Mieszkalne1.add(Wolnel);


        DefaultMutableTreeNode Uzytkowe = new DefaultMutableTreeNode("Użytkowe");
        Lodz.add(Uzytkowe);
        DefaultMutableTreeNode Wynajeteu = new DefaultMutableTreeNode("Wynajete");
        Uzytkowe.add(Wynajeteu);
        DefaultMutableTreeNode Wolneu = new DefaultMutableTreeNode("Wolne");
        Uzytkowe.add(Wolneu);

        DefaultMutableTreeNode Biurowe = new DefaultMutableTreeNode("Biurowe");
        Lodz.add(Biurowe);
        DefaultMutableTreeNode Wynajeteb = new DefaultMutableTreeNode("Wynajete");
        Biurowe.add(Wynajeteb);
        DefaultMutableTreeNode Wolneb = new DefaultMutableTreeNode("Wolne");
        Biurowe.add(Wolneb);


        DefaultMutableTreeNode Krakow = new DefaultMutableTreeNode("Kraków");

        DefaultMutableTreeNode Mieszkalnekm = new DefaultMutableTreeNode("Mieszkalne");
        Krakow.add(Mieszkalnekm);
        DefaultMutableTreeNode Wynajetekm = new DefaultMutableTreeNode("Wynajete");
        Mieszkalnekm.add(Wynajetekm);
        DefaultMutableTreeNode Wolnekm = new DefaultMutableTreeNode("Wolne");
        Mieszkalnekm.add(Wolnekm);


        DefaultMutableTreeNode Uzytkoweku = new DefaultMutableTreeNode("Użytkowe");
        Krakow.add(Uzytkoweku);
        DefaultMutableTreeNode Wynajeteku = new DefaultMutableTreeNode("Wynajete");
        Uzytkoweku.add(Wynajeteku);
        DefaultMutableTreeNode Wolneku = new DefaultMutableTreeNode("Wolne");
        Uzytkoweku.add(Wolneku);

        DefaultMutableTreeNode Biurowekb = new DefaultMutableTreeNode("Biurowe");
        Krakow.add(Biurowekb);
        DefaultMutableTreeNode Wynajetekb = new DefaultMutableTreeNode("Wynajete");
        Biurowekb.add(Wynajetekb);
        DefaultMutableTreeNode Wolnekb = new DefaultMutableTreeNode("Wolne");
        Biurowekb.add(Wolnekb);
        // Krakow.add(Biurowe);
        //add the child nodes to the root node
        root.add(Lodz);
        root.add(Krakow);

        //create the tree by passing in the root node
        //tree1 = new JTree(root);
        model.setRoot(root);


        //Tabela Główna:

        Object rows[][] = {
                {"Staszica", "1", "3", "97-432", "1", "Mieszkalne", "Łódź"},
                {"Pabianicka", "121", "", "92-362", "0", "Biurowe", "Łódź"},
                {"Żelogowksiego", "56", "14", "98-794", "1", "Mieszkalne", "Łódź"},
                {"Rokocińska", "1", "132", "98-111", "1", "Biurowe", "Łódź"},
                {"Municypalna", "4", "", "91-836", "0", "Mieszkalne", "Łódź"},
                {"Abrahama", "5", "3", "97-432", "1", "Mieszkalne", "Kraków"},
                {"Gumniska", "201", "", "92-362", "0", "Biurowe", "Kraków"},
                {"Leszczynowa", "156", "4", "98-794", "1", "Mieszkalne", "Kraków"},
                {"Porfirowa", "15", "32", "98-111", "1", "Biurowe", "Kraków"},
                {"Porzecze", "2", "", "91-836", "0", "Mieszkalne", "Kraków"}
        };
        String columns[] = {"Ulica", "Nr domu", "Nr Mieszkania", "Kod Pocztowy", "Stan", "Typ", "Miasto"};
        DefaultTableModel modelt;
        modelt = new DefaultTableModel(rows, columns);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(modelt);
        TableRowSorter<TableModel> DefaultSorter = new TableRowSorter<TableModel>(modelt);

        tabelaGlowna.setAutoCreateRowSorter(true);
        tabelaGlowna.setModel(modelt);
        tabelaGlowna.setVisible(false);
        TabelaScroll.setVisible(false);
        dodajLokalButton.setVisible(false);
        usuńLokalButton.setVisible(false);
        NrDomu.setVisible(false);
        NrMieszkania.setVisible(false);
        dodajButton.setVisible(false);
        KodPocztowy.setVisible(false);
        Miasto.setVisible(false);
        Typ.setVisible(false);
        Stan.setVisible(false);
        Ulica.setVisible(false);
        DefaultListModel listm = new DefaultListModel();
        list1.setBorder(new EmptyBorder(10,10,10,10));
        listm.addElement("1. Wiadomość 1");
        listm.addElement("2. Wiadomość 2");
        listm.addElement("3. Wiadomość 3");
        list1.setModel(listm);



        //      RowFilter<Object, Object> rf = null;
        //    List<RowFilter<Object,Object>> filters = new ArrayList<RowFilter<Object,Object>>(2);
        //  filters.add(RowFilter.regexFilter("Mieszkalne", 5));
        //filters.add(RowFilter.regexFilter("1", 4));
        //rf = RowFilter.andFilter(filters);
        //sorter.setRowFilter(rf);


        DrzewoLodz.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                list1.setVisible(false);
                ScrollPanelList.setVisible(false);
                Wiadomosci.setVisible(false);
                TabelaScroll.setVisible(true);
                tabelaGlowna.setVisible(true);
                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) DrzewoLodz.getSelectionPath().getLastPathComponent();
                DefaultMutableTreeNode selectedKarol = (DefaultMutableTreeNode) DrzewoLodz.getLastSelectedPathComponent();
                String test;
                test = selectedKarol.toString();
               // textPane1.setText(test);
                String Dziadek = selectedNode.getParent().getParent().toString();
                String Rodzic = selectedNode.getParent().toString();
              //  String Rodzic1 = Rodzic.getParent();
                String Dziecko = selectedNode.toString();

//Filtrowanie tabeli dla miasta ŁÓDŹ: -----------------------------------------------------------------------------------------------------------------------------


                if (test == "Lokale") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Mieszkalne", 5));
                    filters.add(RowFilter.regexFilter("Łódź", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                }
                if (Rodzic == "Łódź" && selectedNode.toString() == "Mieszkalne") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Mieszkalne", 5));
                    filters.add(RowFilter.regexFilter("Łódź", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                }
                if (Dziadek == "Łódź" && selectedNode.toString() == "Wynajete" && Rodzic == "Mieszkalne") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Mieszkalne", 5));
                    filters.add(RowFilter.regexFilter("1", 4));
                    filters.add(RowFilter.regexFilter("Łódź", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                }
                if (Dziadek == "Łódź" && selectedNode.toString() == "Wolne" && Rodzic == "Mieszkalne") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Mieszkalne", 5));
                    filters.add(RowFilter.regexFilter("0", 4));
                    filters.add(RowFilter.regexFilter("Łódź", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                }


                if (Rodzic == "Łódź" && selectedNode.toString() == "Biurowe") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Biurowe", 5));
                    filters.add(RowFilter.regexFilter("Łódź", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                }
                if (Dziadek == "Łódź" && selectedNode.toString() == "Wynajete" && Rodzic == "Biurowe") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Biurowe", 5));
                    filters.add(RowFilter.regexFilter("1", 4));
                    filters.add(RowFilter.regexFilter("Łódź", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                }
                if (Dziadek == "Łódź" && selectedNode.toString() == "Wolne" && Rodzic == "Biurowe") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Biurowe", 5));
                    filters.add(RowFilter.regexFilter("0", 4));
                    filters.add(RowFilter.regexFilter("Łódź", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                }


                if (Rodzic == "Łódź" && selectedNode.toString() == "Użytkowe") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Użytkowe", 5));
                    filters.add(RowFilter.regexFilter("Łódź", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                }
                if (Dziadek == "Łódź" && selectedNode.toString() == "Wynajete" && Rodzic == "Użytkowe") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Użytkowe", 5));
                    filters.add(RowFilter.regexFilter("1", 4));
                    filters.add(RowFilter.regexFilter("Łódź", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                }
                if (Dziadek == "Łódź" && selectedNode.toString() == "Wolne" && Rodzic == "Użytkowe") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Użytkowe", 5));
                    filters.add(RowFilter.regexFilter("0", 4));
                    filters.add(RowFilter.regexFilter("Łódź", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                }

//Filtrowanie tabeli dla miasta KRAKÓW: -----------------------------------------------------------------------------------------------------------------------------

                if (Rodzic == "Kraków" && selectedNode.toString() == "Mieszkalne") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Mieszkalne", 5));
                    filters.add(RowFilter.regexFilter("Kraków", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                    Costam.revalidate();
                }
                if (Dziadek == "Kraków" && selectedNode.toString() == "Wynajete" && Rodzic == "Mieszkalne") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Mieszkalne", 5));
                    filters.add(RowFilter.regexFilter("1", 4));
                    filters.add(RowFilter.regexFilter("Kraków", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                    Costam.revalidate();
                }
                if (Dziadek == "Kraków" && selectedNode.toString() == "Wolne" && Rodzic == "Mieszkalne") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Mieszkalne", 5));
                    filters.add(RowFilter.regexFilter("0", 4));
                    filters.add(RowFilter.regexFilter("Kraków", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                    Costam.revalidate();
                }


                if (Rodzic == "Kraków" && selectedNode.toString() == "Biurowe") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Biurowe", 5));
                    filters.add(RowFilter.regexFilter("Kraków", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                    Costam.revalidate();
                }
                if (Dziadek == "Kraków" && selectedNode.toString() == "Wynajete" && Rodzic == "Biurowe") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Biurowe", 5));
                    filters.add(RowFilter.regexFilter("1", 4));
                    filters.add(RowFilter.regexFilter("Kraków", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                    Costam.revalidate();
                }
                if (Dziadek == "Kraków" && selectedNode.toString() == "Wolne" && Rodzic == "Biurowe") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Biurowe", 5));
                    filters.add(RowFilter.regexFilter("0", 4));
                    filters.add(RowFilter.regexFilter("Kraków", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                    Costam.revalidate();
                }


                if (Rodzic == "Kraków" && selectedNode.toString() == "Użytkowe") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Użytkowe", 5));
                    filters.add(RowFilter.regexFilter("Kraków", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                    Costam.revalidate();
                }
                if (Dziadek == "Kraków" && selectedNode.toString() == "Wynajete" && Rodzic == "Użytkowe") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Użytkowe", 5));
                    filters.add(RowFilter.regexFilter("1", 4));
                    filters.add(RowFilter.regexFilter("Kraków", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                    Costam.revalidate();
                }
                if (Dziadek == "Kraków" && selectedNode.toString() == "Wolne" && Rodzic == "Użytkowe") {
                    RowFilter<Object, Object> rf = null;
                    List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    filters.add(RowFilter.regexFilter("Użytkowe", 5));
                    filters.add(RowFilter.regexFilter("0", 4));
                    filters.add(RowFilter.regexFilter("Kraków", 6));
                    rf = RowFilter.andFilter(filters);
                    sorter.setRowFilter(rf);
                    Costam.revalidate();
                }
                // Odświerzanie i zmiana widoku: -------------------------------------------------------------------------------

                //   textPane1.setText(DrzewoLodz.);
               // sorter.setModel(modelt);
                tabelaGlowna.setRowSorter(sorter);
                TabelaScroll.setVisible(true);
                tabelaGlowna.setVisible(true);

                Costam.revalidate();
            }
        });
//    Comment this code to add table dynamically
        // tabelaGlowna.setModel(dataModel);

//    Uncomment this code to add table dynamically:
//    JTable myTable = new JTable(dataModel);
//    myTable.setPreferredScrollableViewportSize(new Dimension(400, 100));
//    scrollPane.setViewportView(myTable);


        stonaGłównaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TabelaScroll.setVisible(false);
                tabelaGlowna.setVisible(false);
                ScrollPanelList.setVisible(true);
                list1.setVisible(true);
                Wiadomosci.setVisible(true);
                dodajLokalButton.setVisible(false);
                usuńLokalButton.setVisible(false);
                dodajLokalButton.setVisible(false);
                usuńLokalButton.setVisible(false);
                DodawanieLokalu.setVisible(false);
                NrDomu.setVisible(false);
                NrMieszkania.setVisible(false);
                dodajButton.setVisible(false);
                KodPocztowy.setVisible(false);
                Miasto.setVisible(false);
                Typ.setVisible(false);
                Stan.setVisible(false);
                Ulica.setVisible(false);
                DodawanieLokalu.setVisible(false);

            }
        });
        tabelaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TabelaScroll.setVisible(true);
                tabelaGlowna.setVisible(true);
                ScrollPanelList.setVisible(false);
                list1.setVisible(false);
                Wiadomosci.setVisible(false);
                dodajLokalButton.setVisible(true);
                usuńLokalButton.setVisible(true);
                DodawanieLokalu.setVisible(false);
                NrDomu.setVisible(false);
                NrMieszkania.setVisible(false);
                dodajButton.setVisible(false);
                KodPocztowy.setVisible(false);
                Miasto.setVisible(false);
                Typ.setVisible(false);
                Stan.setVisible(false);Ulica.setVisible(false);
                tabelaGlowna.setRowSorter(DefaultSorter);

            }
        });

        dodajLokalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DodawanieLokalu.setVisible(true);
                NrDomu.setVisible(true);
                NrMieszkania.setVisible(true);
                dodajButton.setVisible(true);
                KodPocztowy.setVisible(true);
                Miasto.setVisible(true);
                Typ.setVisible(true);
                Stan.setVisible(true);
                Ulica.setVisible(true);
            }
        });
        Object[] row = new Object[7];
        dodajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                row[0] = Ulica.getText();
                row[1] = NrDomu.getText();
                row[2] = NrMieszkania.getText();
                row[3] = KodPocztowy.getText();
                row[4] = Stan.getText();
                row[5] = Typ.getText();
                row[6] = Miasto.getText();
                modelt.addRow(row);
            }
        });
        usuńLokalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = tabelaGlowna.getSelectedRow();
                if(i>=0)
                {
                    modelt.removeRow(i);
                }
                else
                {
                    System.out.println("Problem z usunięciem");
                }
            }
        });
    }
//"Ulica", "Nr domu", "Nr Mieszkania", "Kod Pocztowy", "Stan", "Typ", "Miasto"

    public static void main(String[] args) {
        JFrame frame = new JFrame("Inzyn");
        frame.setContentPane(new Inzyn().Costam);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
