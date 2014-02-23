/***********************************************************************
 * Module:  GererStatistique.java
 * Author:  tasnim
 * Purpose: Defines the Class GererStatistique
 ***********************************************************************/

import java.util.*;

/** @pdOid 2d038a7f-3ae2-4cdb-bdc3-323bc70c6f5c */
public class GererStatistique {
   /** @pdRoleInfo migr=no name=InterfaceGestionStatistiques assc=association54 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceGestionStatistiques> interfaceGestionStatistiques;
   /** @pdRoleInfo migr=no name=InterfaceConsultationStatistiques assc=association55 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceConsultationStatistiques> interfaceConsultationStatistiques;
   
   /** @pdOid 1c3c450b-e65b-4499-b61d-9ff1eb1ce1e3 */
   public int consulterNbreVisiteur() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 04a8e34c-2e50-47b0-959c-62262d8a36d3 */
   public int consultervisiteurParDate() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 6329e0fd-b08c-4261-89a0-ee2cc0e8ef82 */
   public int consulterNbreAccesParArticle() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid ba3dbc34-d9bc-4d6b-a4c8-6c87f5f73813 */
   public int consulterNbreAccesEvent() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 3bababe7-f647-4bb0-80d7-d92c51b41fbf */
   public int calculerStatistique() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 04619207-48a4-4bf0-af66-8f41ccbcd475 */
   public int afficherStatVisite() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 404f47cc-171e-437c-a81f-ba7b00d5eb3b */
   public int afficherStatVisiteParType() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceGestionStatistiques> getInterfaceGestionStatistiques() {
      if (interfaceGestionStatistiques == null)
         interfaceGestionStatistiques = new java.util.HashSet<InterfaceGestionStatistiques>();
      return interfaceGestionStatistiques;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceGestionStatistiques() {
      if (interfaceGestionStatistiques == null)
         interfaceGestionStatistiques = new java.util.HashSet<InterfaceGestionStatistiques>();
      return interfaceGestionStatistiques.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceGestionStatistiques */
   public void setInterfaceGestionStatistiques(java.util.Collection<InterfaceGestionStatistiques> newInterfaceGestionStatistiques) {
      removeAllInterfaceGestionStatistiques();
      for (java.util.Iterator iter = newInterfaceGestionStatistiques.iterator(); iter.hasNext();)
         addInterfaceGestionStatistiques((InterfaceGestionStatistiques)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceGestionStatistiques */
   public void addInterfaceGestionStatistiques(InterfaceGestionStatistiques newInterfaceGestionStatistiques) {
      if (newInterfaceGestionStatistiques == null)
         return;
      if (this.interfaceGestionStatistiques == null)
         this.interfaceGestionStatistiques = new java.util.HashSet<InterfaceGestionStatistiques>();
      if (!this.interfaceGestionStatistiques.contains(newInterfaceGestionStatistiques))
         this.interfaceGestionStatistiques.add(newInterfaceGestionStatistiques);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceGestionStatistiques */
   public void removeInterfaceGestionStatistiques(InterfaceGestionStatistiques oldInterfaceGestionStatistiques) {
      if (oldInterfaceGestionStatistiques == null)
         return;
      if (this.interfaceGestionStatistiques != null)
         if (this.interfaceGestionStatistiques.contains(oldInterfaceGestionStatistiques))
            this.interfaceGestionStatistiques.remove(oldInterfaceGestionStatistiques);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceGestionStatistiques() {
      if (interfaceGestionStatistiques != null)
         interfaceGestionStatistiques.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceConsultationStatistiques> getInterfaceConsultationStatistiques() {
      if (interfaceConsultationStatistiques == null)
         interfaceConsultationStatistiques = new java.util.HashSet<InterfaceConsultationStatistiques>();
      return interfaceConsultationStatistiques;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceConsultationStatistiques() {
      if (interfaceConsultationStatistiques == null)
         interfaceConsultationStatistiques = new java.util.HashSet<InterfaceConsultationStatistiques>();
      return interfaceConsultationStatistiques.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceConsultationStatistiques */
   public void setInterfaceConsultationStatistiques(java.util.Collection<InterfaceConsultationStatistiques> newInterfaceConsultationStatistiques) {
      removeAllInterfaceConsultationStatistiques();
      for (java.util.Iterator iter = newInterfaceConsultationStatistiques.iterator(); iter.hasNext();)
         addInterfaceConsultationStatistiques((InterfaceConsultationStatistiques)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceConsultationStatistiques */
   public void addInterfaceConsultationStatistiques(InterfaceConsultationStatistiques newInterfaceConsultationStatistiques) {
      if (newInterfaceConsultationStatistiques == null)
         return;
      if (this.interfaceConsultationStatistiques == null)
         this.interfaceConsultationStatistiques = new java.util.HashSet<InterfaceConsultationStatistiques>();
      if (!this.interfaceConsultationStatistiques.contains(newInterfaceConsultationStatistiques))
         this.interfaceConsultationStatistiques.add(newInterfaceConsultationStatistiques);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceConsultationStatistiques */
   public void removeInterfaceConsultationStatistiques(InterfaceConsultationStatistiques oldInterfaceConsultationStatistiques) {
      if (oldInterfaceConsultationStatistiques == null)
         return;
      if (this.interfaceConsultationStatistiques != null)
         if (this.interfaceConsultationStatistiques.contains(oldInterfaceConsultationStatistiques))
            this.interfaceConsultationStatistiques.remove(oldInterfaceConsultationStatistiques);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceConsultationStatistiques() {
      if (interfaceConsultationStatistiques != null)
         interfaceConsultationStatistiques.clear();
   }

}