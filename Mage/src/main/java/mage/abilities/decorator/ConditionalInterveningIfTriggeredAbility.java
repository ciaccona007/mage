package mage.abilities.decorator;

import mage.abilities.Modes;
import mage.abilities.TriggeredAbility;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.condition.Condition;
import mage.abilities.effects.Effect;
import mage.abilities.effects.Effects;
import mage.constants.EffectType;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.watchers.Watcher;

import java.util.List;

/**
 * Adds condition to {@link mage.abilities.effects.ContinuousEffect}. Acts as
 * decorator.
 *
 * @author nantuko
 */
public class ConditionalInterveningIfTriggeredAbility extends TriggeredAbilityImpl {

    protected TriggeredAbility ability;
    protected Condition condition;
    protected String abilityText;

    /**
     * Triggered ability with a condition. Set the optionality for the trigger
     * ability itself.
     *
     * @param ability
     * @param condition
     * @param text      explicit rule text for the ability, if null or empty, the
     *                  rule text generated by the triggered ability itself is used.
     */
    public ConditionalInterveningIfTriggeredAbility(TriggeredAbility ability, Condition condition, String text) {
        super(ability.getZone(), null);
        this.ability = ability;
        this.condition = condition;
        this.abilityText = text;
    }

    public ConditionalInterveningIfTriggeredAbility(final ConditionalInterveningIfTriggeredAbility triggered) {
        super(triggered);
        this.ability = triggered.ability.copy();
        this.condition = triggered.condition;
        this.abilityText = triggered.abilityText;
    }

    @Override
    public boolean checkInterveningIfClause(Game game) {
        return condition.apply(game, this);
    }

    @Override
    public ConditionalInterveningIfTriggeredAbility copy() {
        return new ConditionalInterveningIfTriggeredAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return ability.checkEventType(event, game);
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        ability.setSourceId(this.getSourceId());
        ability.setControllerId(this.getControllerId());
        return ability.checkTrigger(event, game);
    }

    @Override
    public String getRule() {
        if (abilityText == null || abilityText.isEmpty()) {
            return ability.getRule();
        }
        return abilityText;
    }

    @Override
    public Effects getEffects() {
        return ability.getEffects();
    }

    @Override
    public void addEffect(Effect effect) {
        ability.addEffect(effect);
    }

    @Override
    public Modes getModes() {
        return ability.getModes();
    }

    @Override
    public List<Watcher> getWatchers() {
        return ability.getWatchers();
    }

    @Override
    public void addWatcher(Watcher watcher) {
        ability.addWatcher(watcher);
    }

    @Override
    public Effects getEffects(Game game, EffectType effectType) {
        return ability.getEffects(game, effectType);
    }

    @Override
    public boolean isOptional() {
        return ability.isOptional();
    }

    @Override
    public void setSourceObjectZoneChangeCounter(int sourceObjectZoneChangeCounter) {
        ability.setSourceObjectZoneChangeCounter(sourceObjectZoneChangeCounter);
    }

    @Override
    public int getSourceObjectZoneChangeCounter() {
        return ability.getSourceObjectZoneChangeCounter();
    }
}
