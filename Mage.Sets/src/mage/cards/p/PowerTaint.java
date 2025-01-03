package mage.cards.p;

import mage.abilities.Ability;
import mage.abilities.triggers.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.AttachEffect;
import mage.abilities.effects.common.DoUnlessTargetPlayerOrTargetsControllerPaysEffect;
import mage.abilities.effects.common.LoseLifeTargetEffect;
import mage.abilities.keyword.CyclingAbility;
import mage.abilities.keyword.EnchantAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.target.TargetPermanent;
import mage.target.common.TargetEnchantmentPermanent;

import java.util.UUID;

/**
 * @author jeffwadsworth
 */
public final class PowerTaint extends CardImpl {

    public PowerTaint(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{1}{U}");

        this.subtype.add(SubType.AURA);

        // Enchant enchantment
        TargetPermanent auraTarget = new TargetEnchantmentPermanent();
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.Detriment));
        Ability ability = new EnchantAbility(auraTarget);
        this.addAbility(ability);

        // At the beginning of the upkeep of enchanted enchantment's controller, that player loses 2 life unless they pay {2}.
        Effect effect = new DoUnlessTargetPlayerOrTargetsControllerPaysEffect(new LoseLifeTargetEffect(2),
                new ManaCostsImpl<>("{2}")).setText("that player loses 2 life unless they pay {2}");
        this.addAbility(new BeginningOfUpkeepTriggeredAbility(TargetController.CONTROLLER_ATTACHED_TO, effect,
                false)
                .setTriggerPhrase("At the beginning of the upkeep of enchanted enchantment's controller, "));

        // Cycling {2}
        this.addAbility(new CyclingAbility(new ManaCostsImpl<>("{2}")));

    }

    private PowerTaint(final PowerTaint card) {
        super(card);
    }

    @Override
    public PowerTaint copy() {
        return new PowerTaint(this);
    }
}
