/***********************************************************************
 * Module:  InterfaceGestionFilm.java
 * Author:  tasnim
 * Purpose: Defines the Class InterfaceGestionFilm
 ***********************************************************************/

import java.util.*;

/** @pdOid d8d5400c-ed64-4a5c-940f-fd19c11d1ee6 */
public class InterfaceGestionFilm {
   /** @pdRoleInfo migr=no name=InterfaceAccueilAdmin assc=association19 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceAccueilAdmin> interfaceAccueilAdmin;
   /** @pdRoleInfo migr=no name=GererRubrique assc=association35 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<GererRubrique> gererRubrique;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceAccueilAdmin> getInterfaceAccueilAdmin() {
      if (interfaceAccueilAdmin == null)
         interfaceAccueilAdmin = new java.util.HashSet<InterfaceAccueilAdmin>();
      return interfaceAccueilAdmin;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceAccueilAdmin() {
      if (interfaceAccueilAdmin == null)
         interfaceAccueilAdmin = new java.util.HashSet<InterfaceAccueilAdmin>();
      return interfaceAccueilAdmin.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceAccueilAdmin */
   public void setInterfaceAccueilAdmin(java.util.Collection<InterfaceAccueilAdmin> newInterfaceAccueilAdmin) {
      removeAllInterfaceAccueilAdmin();
      for (java.util.Iterator iter = newInterfaceAccueilAdmin.iterator(); iter.hasNext();)
         addInterfaceAccueilAdmin((InterfaceAccueilAdmin)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceAccueilAdmin */
   public void addInterfaceAccueilAdmin(InterfaceAccueilAdmin newInterfaceAccueilAdmin) {
      if (newInterfaceAccueilAdmin == null)
         return;
      if (this.interfaceAccueilAdmin == null)
         this.interfaceAccueilAdmin = new java.util.HashSet<InterfaceAccueilAdmin>();
      if (!this.interfaceAccueilAdmin.contains(newInterfaceAccueilAdmin))
         this.interfaceAccueilAdmin.add(newInterfaceAccueilAdmin);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceAccueilAdmin */
   public void removeInterfaceAccueilAdmin(InterfaceAccueilAdmin oldInterfaceAccueilAdmin) {
      if (oldInterfaceAccueilAdmin == null)
         return;
      if (this.interfaceAccueilAdmin != null)
         if (this.interfaceAccueilAdmin.contains(oldInterfaceAccueilAdmin))
            this.interfaceAccueilAdmin.remove(oldInterfaceAccueilAdmin);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceAccueilAdmin() {
      if (interfaceAccueilAdmin != null)
         interfaceAccueilAdmin.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<GererRubrique> getGererRubrique() {
      if (gererRubrique == null)
         gererRubrique = new java.util.HashSet<GererRubrique>();
      return gererRubrique;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorGererRubrique() {
      if (gererRubrique == null)
         gererRubrique = new java.util.HashSet<GererRubrique>();
      return gererRubrique.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newGererRubrique */
   public void setGererRubrique(java.util.Collection<GererRubrique> newGererRubrique) {
      removeAllGererRubrique();
      for (java.util.Iterator iter = newGererRubrique.iterator(); iter.hasNext();)
         addGererRubrique((GererRubrique)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGererRubrique */
   public void addGererRubrique(GererRubrique newGererRubrique) {
      if (newGererRubrique == null)
         return;
      if (this.gererRubrique == null)
         this.gererRubrique = new java.util.HashSet<GererRubrique>();
      if (!this.gererRubrique.contains(newGererRubrique))
         this.gererRubrique.add(newGererRubrique);
   }
   
   /** @pdGenerated default remove
     * @param oldGererRubrique */
   public void removeGererRubrique(GererRubrique oldGererRubrique) {
      if (oldGererRubrique == null)
         return;
      if (this.gererRubrique != null)
         if (this.gererRubrique.contains(oldGererRubrique))
            this.gererRubrique.remove(oldGererRubrique);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllGererRubrique() {
      if (gererRubrique != null)
         gererRubrique.clear();
   }

}