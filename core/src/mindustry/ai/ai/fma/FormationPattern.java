package mindustry.ai.ai.fma;

import mindustry.ai.ai.utils.*;

/**
 * The {@code FormationPattern} interface represents the shape of a formation and generates the slot offsets, relative to its
 * anchor point. Since formations can be scalable the pattern must be able to determine if a given number of slots is supported.
 * <p>
 * Each particular pattern (such as a V, wedge, circle) needs its own instance of a class that implements this
 * {@code FormationPattern} interface.
 * @author davebaol
 */
public interface FormationPattern{

    /**
     * Sets the number of slots.
     * @param numberOfSlots the number of slots to set
     */
    void setNumberOfSlots(int numberOfSlots);

    /** Returns the location of the given slot index. */
    Location calculateSlotLocation(Location outLocation, int slotNumber);

    /**
     * Returns true if the pattern can support the given number of slots
     * @param slotCount the number of slots
     * @return {@code true} if this pattern can support the given number of slots; {@code false} othervwise.
     */
    boolean supportsSlots(int slotCount);
}
