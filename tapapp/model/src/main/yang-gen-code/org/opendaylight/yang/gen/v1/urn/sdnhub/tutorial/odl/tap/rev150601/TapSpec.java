package org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;tap&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/tap.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container tap-spec {
 *     list tap {
 *         key "id"
 *         leaf id {
 *             type string;
 *         }
 *         leaf node {
 *             type leafref;
 *         }
 *         leaf-list src-node-connector {
 *             type leafref;
 *         }
 *         leaf-list sink-node-connector {
 *             type leafref;
 *         }
 *         container mac-address-match {
 *             leaf type {
 *                 type field-type;
 *             }
 *             leaf value {
 *                 type mac-address;
 *             }
 *         }
 *         container ip-address-match {
 *             leaf type {
 *                 type field-type;
 *             }
 *             leaf value {
 *                 type ipv4-prefix;
 *             }
 *         }
 *         leaf traffic-match {
 *             type traffic-type;
 *         }
 *         leaf dl-type {
 *             type uint16;
 *         }
 *         leaf nw-proto {
 *             type uint8;
 *         }
 *         leaf tp-src {
 *             type uint16;
 *         }
 *         leaf tp-dst {
 *             type uint16;
 *         }
 *         augment \(urn:sdnhub:tutorial:odl:tap)tap-spec\(urn:sdnhub:tutorial:odl:tap)tap {
 *             status CURRENT;
 *             leaf dl-type {
 *                 type uint16;
 *             }
 *             leaf nw-proto {
 *                 type uint8;
 *             }
 *             leaf tp-src {
 *                 type uint16;
 *             }
 *             leaf tp-dst {
 *                 type uint16;
 *             }
 *         }
 *         uses tap-grouping;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;tap/tap-spec&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.TapSpecBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.TapSpecBuilder
 *
 */
public interface TapSpec
    extends
    ChildOf<TapData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.TapSpec>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:sdnhub:tutorial:odl:tap","2015-06-01","tap-spec"));

    List<Tap> getTap();

}

