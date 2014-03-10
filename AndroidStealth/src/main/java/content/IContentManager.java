package content;

import java.util.Collection;

/**
 * Created by Alex on 3/6/14.
 */
public interface IContentManager {
    /**
     * A listener interface that gets notified whenever the content in the storage is changed
     */
    public interface ContentChangedListener {
        public void contentChanged();
    }

    /**
     * @return an {@link java.util.Collection} of all the items currently stored in the application
     */
    public Collection<ContentItem> getStoredContent();

    /**
     * Adds a new item to the storage
     * @param item the item to be added
     */
    public void addItem(ContentItem item);

    /**
     * Removes an item from the storage
     * @param item the item that should be removed
     * @return whether the item has been successfully removed
     */
    public boolean removeItem(ContentItem item);

    /**
     * Removes a collection of items from storage
     * @param itemCollection The collection of items to be removed
     */
    public void removeItems(Collection<ContentItem> itemCollection);

    /**
     * Adds a listener to the list
     * @param listener listener to be added
     */
    public void addContentChangedListener(ContentChangedListener listener);

    /**
     * Removes the listener from the list
     * @param listener listener that should be removed
     * @return whether the listener has been successfully removed
     */
    public boolean removeContentChangedListener(ContentChangedListener listener);
}