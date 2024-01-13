package com.company.product.implementation.product;

import com.company.product.model.dto.EbookProductDTO;
import com.company.product.model.entity.EbookProduct;
import com.company.product.repository.EbookProductRepository;
import com.company.product.service.product.ProductService;
import com.company.product.utils.DateHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EbookProductServiceImpl implements ProductService<EbookProductDTO> {
    private EbookProductRepository ebookProductRepository;

    @Autowired
    public EbookProductServiceImpl(EbookProductRepository ebookProductRepository) {
        this.ebookProductRepository = ebookProductRepository;
    }

    @Override
    public void save(EbookProductDTO ebookProductDTO) {
        try {
            EbookProduct ebookProduct = EbookProduct.builder()
                    .name(ebookProductDTO.getName())
                    .description(ebookProductDTO.getDescription())
                    .rating(ebookProductDTO.getRating())
                    .availability(ebookProductDTO.isAvailability())
                    .price(ebookProductDTO.getPrice())
                    .author(ebookProductDTO.getAuthor())
                    .genre(ebookProductDTO.getGenre())
                    .publishDate(DateHelperUtil.convertToEpoch(ebookProductDTO.getPublishDate()))
                    .language(ebookProductDTO.getLanguage())
                    .numberOfPages(ebookProductDTO.getNumberOfPages())
                    .build();

            ebookProductRepository.save(ebookProduct);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}