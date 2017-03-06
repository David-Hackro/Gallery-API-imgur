package tutorials.hackro.com.gallery.presentation.mapper;

import tutorials.hackro.com.gallery.data.remote.Mapper;
import tutorials.hackro.com.gallery.domain.model.DataDomain;
import tutorials.hackro.com.gallery.presentation.model.DataPresentation;

/**
 * Created by hackro on 6/03/17.
 */
public class ImageMapper  extends Mapper<DataPresentation,DataDomain>{


    @Override
    public DataDomain map(DataPresentation value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DataPresentation reverseMap(DataDomain value) {
        DataPresentation dataPresentation = new DataPresentation();

        dataPresentation.setId(value.getId());
        dataPresentation.setTitle(value.getTitle());
        dataPresentation.setDescription(value.getDescription());
        dataPresentation.setDatetime(value.getDatetime());
        dataPresentation.setLink(value.getLink());
        return dataPresentation;
    }
}
