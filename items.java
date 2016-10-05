package farmerGameOutliune;

/**
 * The {@link items} class is used to store the item ID and a description of the item. It will also be 
 * able to use the item.
 * @author Jessica Castron
 *
 */
public class items {
	
		/**
		 * This is a special number assigned to each item to identify it. Each item has a different
		 * number.
		 */
		private int id;
		
		/**
		 * The description is an explanation of what the item does; weather it can heal the {@link farmer}
		 * or speed it up.
		 */
		private String description;
		
		/**
		 * This field stores weather the item will restore health and if so how much.
		 */
		private int healthRestored;
		
		/**
		 * This field stores weather the item will speed the {@link farmer} up and if so by how much.
		 */
		private int speedGained;
		
		/**
		 * The {@link #farmerInItem}farmerInItem field allows the item class to access {@link farmer} class so that the @farmer
		 * can see the item info and so that the items can effect the {@link farmer}.
		 */
		private farmer farmerInItem;
	
		/**
		 * Constructor for {@link items} object so we can initialize all the parameters.
		 */
		public items (){
			
		}
		
	/**
	 * This allows the item to see the {@link farmer}'s health and speed.
	 */
	public void item( farmer farmerInItem ){
		
	}
	
	/**
	 * This will call the {@link items} into the {@link HUD} when an item is found.
	 * @param x X-coordinates of the item inside the HUD
	 * @param y Y-coordinates of the item inside the HUD
	 */
	public void draw( float x, float y ){
		
	}
	
	/**
	 * This will use the items; changing the {@link farmer}'s health or speed accordingly.
	 */
	public void use(){
		
	}

}