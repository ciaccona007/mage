
package mage.cards.m;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.dynamicvalue.common.SourcePermanentPowerValue;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.abilities.effects.common.continuous.GainAbilitySourceEffect;
import mage.abilities.keyword.ShroudAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author LoneFox
 */
public final class MinotaurIllusionist extends CardImpl {

    public MinotaurIllusionist(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{3}{U}{R}");
        this.subtype.add(SubType.MINOTAUR);
        this.subtype.add(SubType.WIZARD);
        this.power = new MageInt(3);
        this.toughness = new MageInt(4);

        // {1}{U}: Minotaur Illusionist gains shroud until end of turn.
        this.addAbility(new SimpleActivatedAbility(Zone.BATTLEFIELD, new GainAbilitySourceEffect(ShroudAbility.getInstance(),
            Duration.EndOfTurn), new ManaCostsImpl<>("{1}{U}")));
        // {R}, Sacrifice Minotaur Illusionist: Minotaur Illusionist deals damage equal to its power to target creature.
        Effect effect = new DamageTargetEffect(SourcePermanentPowerValue.NOT_NEGATIVE);
        effect.setText("it deals damage equal to its power to target creature.");
        Ability ability = new SimpleActivatedAbility(Zone.BATTLEFIELD, effect, new ManaCostsImpl<>("{R}"));
        ability.addCost(new SacrificeSourceCost());
        ability.addTarget(new TargetCreaturePermanent());
        this.addAbility(ability);
    }

    private MinotaurIllusionist(final MinotaurIllusionist card) {
        super(card);
    }

    @Override
    public MinotaurIllusionist copy() {
        return new MinotaurIllusionist(this);
    }
}
