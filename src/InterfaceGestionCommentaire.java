/***********************************************************************
 * Module:  InterfaceGestionCommentaire.java
 * Author:  tasnim
 * Purpose: Defines the Class InterfaceGestionCommentaire
 ***********************************************************************/

import java.util.*;

/** @pdOid 4a955c50-05db-4a42-9ba5-3b23355aa38f */
public class InterfaceGestionCommentaire {
   /** @pdRoleInfo migr=no name=InterfaceAccueilAdmin assc=association20 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceAccueilAdmin> interfaceAccueilAdmin;
   /** @pdRoleInfo migr=no name=GererCommentaire assc=association36 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<GererCommentaire> gererCommentaire;
   
   
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
   public java.util.Collection<GererCommentaire> getGererCommentaire() {
      if (gererCommentaire == null)
         gererCommentaire = new java.util.HashSet<GererCommentaire>();
      return gererCommentaire;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorGererCommentaire() {
      if (gererCommentaire == null)
         gererCommentaire = new java.util.HashSet<GererCommentaire>();
      return gererCommentaire.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newGererCommentaire */
   public void setGererCommentaire(java.util.Collection<GererCommentaire> newGererCommentaire) {
      removeAllGererCommentaire();
      for (java.util.Iterator iter = newGererCommentaire.iterator(); iter.hasNext();)
         addGererCommentaire((GererCommentaire)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGererCommentaire */
   public void addGererCommentaire(GererCommentaire newGererCommentaire) {
      if (newGererCommentaire == null)
         return;
      if (this.gererCommentaire == null)
         this.gererCommentaire = new java.util.HashSet<GererCommentaire>();
      if (!this.gererCommentaire.contains(newGererCommentaire))
         this.gererCommentaire.add(newGererCommentaire);
   }
   
   /** @pdGenerated default remove
     * @param oldGererCommentaire */
   public void removeGererCommentaire(GererCommentaire oldGererCommentaire) {
      if (oldGererCommentaire == null)
         return;
      if (this.gererCommentaire != null)
         if (this.gererCommentaire.contains(oldGererCommentaire))
            this.gererCommentaire.remove(oldGererCommentaire);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllGererCommentaire() {
      if (gererCommentaire != null)
         gererCommentaire.clear();
   }

}