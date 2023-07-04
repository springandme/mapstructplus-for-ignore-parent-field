package com.hliushi.test.common.bo;

/**
 * @author: hliushi
 * @date: 2023/3/2 23:40
 **/
// @MappedSuperclass
public class EntityBase implements BizEntity {

    private static final long serialVersionUID = 1L;

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(updatable = false)
    private Long id;


    public EntityBase() {
    }

    @Override
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
